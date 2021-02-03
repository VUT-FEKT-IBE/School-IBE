package cz.vutbr.feec.cviko10;

import org.deeplearning4j.datasets.iterator.impl.MnistDataSetIterator;
import org.nd4j.evaluation.classification.Evaluation;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.inputs.InputType;
import org.deeplearning4j.nn.conf.layers.Convolution2D;
import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.DropoutLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.conf.layers.SubsamplingLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.weights.WeightInit;
import org.deeplearning4j.optimize.listeners.ScoreIterationListener;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.impl.layers.convolution.Conv2D;
import org.nd4j.linalg.api.ops.random.impl.DropOut;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.nd4j.linalg.learning.config.Adam;
import org.nd4j.linalg.learning.config.Nesterovs;
import org.nd4j.linalg.lossfunctions.LossFunctions;
import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction;

public class MNISTStart {

	public static void main(String[] args) throws Exception {
		final int numRows = 28; // standartizovaná velikost MNIST samplu - výška v pixelech
		final int numColumns = 28;
		int numRowCol = numRows * numColumns;
		int outputNum = 10; // poèet tøíd do kolika jsou samply klasifikované
		int batchSize = 64; // nastavení množství souèasnì zpracovávaných samplù
		int rngSeed = 123; // nastavení seedu pro vytvoøení náhodných èísel
		int numEpochs = 10; // poèet iterací bìhem úèení
		double rate = 0.000015; // nastavení koeficientu rychlosti uèení (learning rate)

		// Naètení standartiyované MNIST datasetu - vytvoøení trénovací a testovací
		// množiny
		DataSetIterator mnistTrain = new MnistDataSetIterator(batchSize, 6000, true, false, true, rngSeed);
		DataSetIterator mnistValid = new MnistDataSetIterator(batchSize, 200, true, false, true, rngSeed);
		DataSetIterator mnistTest = new MnistDataSetIterator(batchSize, 1000, true, false, true, rngSeed);

		MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder().seed(rngSeed) // nastavení seedu pro
																							// vytvoøení náhodných èísel
				.weightInit(WeightInit.XAVIER) // nastavení výchozích vah sítì
				.updater(new Adam(rate)) // optimalizátor ADAM
				.l2(rate) // nastavení rychlosti uèení
				.list().layer(0, new ConvolutionLayer.Builder(3, 3)
						.stride(1, 1) // max (3,3) cim vyssi tim rapidne mensi presnost
						.nOut(50) // cim vysi cislo tim dele to trva presnost se zvetsi pri vyssich hodnatach obou
									// vrstev
						.activation(Activation.IDENTITY).build())
				.layer(1, new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
						.kernelSize(1, 1) // zmensi presnost cim vyssi cislo
						.stride(1, 1) // zmenseni presnosti pri zvyseni cisla max (8, 8)
						.build())
				.layer(2, new ConvolutionLayer.Builder(3, 3)
						.stride(1, 1)
						.nOut(30)
						.activation(Activation.IDENTITY)
						.build())
				.layer(3, new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
						.kernelSize(1, 1)
						.stride(1, 1)
						.build())
				.layer(4, new DenseLayer.Builder() // plnì propojená vrstva
						.nOut(5000) // mnozstvi neuronu v plne propojene vrstve
						.activation(Activation.RELU) // aktivaèní funkce RELU
						.build())
				.layer(5, new DenseLayer.Builder()
						.nOut(2500) // cim vic tim vyssi presnot ale delsi doba zpracovani
						.activation(Activation.RELU).build())
				.layer(6, new DropoutLayer.Builder()
						.dropOut(0.5) // zmensi se accuracy ale precision se zmensi jen
									  // otrochu a nejake casti budou vyrazeny z poznavani
						.build())
				.layer(7, new OutputLayer.Builder(LossFunction.NEGATIVELOGLIKELIHOOD) // vystupni vrstva
						.activation(Activation.SOFTMAX) // SOFTMAX funkce
						.nOut(outputNum) // mnozstvi neuronu ve vystupni vrstve = mnozstvi predikovanych trid
						.build())
				.setInputType(InputType.convolutionalFlat(numRows, numColumns, 1)).build();

		MultiLayerNetwork model = new MultiLayerNetwork(conf);
		model.init(); // inicializace modelu pøed jeho použitím
		model.setListeners(new ScoreIterationListener(1)); // print the score with every iteration

		Evaluation eval = new Evaluation(outputNum); // vytvoreni evaluace

		System.out.println("Proces trenovani");
		for (int i = 0; i < numEpochs; i++) { // jednotlive iterace
			model.fit(mnistTrain); // trenovani modelu !!!!!!!!!!!!
			mnistValid.reset();
			while (mnistValid.hasNext()) { // validace modelu v aktualni iteraci
				DataSet next = mnistValid.next();
				INDArray output = model.output(next.getFeatures()); // get the networks prediction
				eval.eval(next.getLabels(), output); // check the prediction against the true class
			}
			System.out.println("Epocha " + i + " uspesnost modelu na validacni mnozine " + eval.accuracy());
		}

		System.out.println("Proces testovani....");

		DataBuffer batchSamplesData = null;
		INDArray batchSamplesPredictions = null;
		boolean add = true;

		while (mnistTest.hasNext()) {
			DataSet next = mnistTest.next();
			INDArray output = model.output(next.getFeatures()); // get the networks prediction
			eval.eval(next.getLabels(), output); // check the prediction against the true class
			if (add) {
				batchSamplesData = next.getFeatures().data();
				batchSamplesPredictions = output;
				add = false;
			}
		}

		Tools.showSamples(batchSamplesData, batchSamplesPredictions, numColumns, numRows, outputNum);
		System.out.println(eval.stats());
	}

}
