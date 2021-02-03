package cz.vutbr.feec.cviko10;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.ndarray.INDArray;
/**
 * Neni nutno zkoumat, neztracejte tim cas
 * @author Vojta
 *
 */
public final class Tools {
	
	public final static void showSamples(DataBuffer samplesData, INDArray samplesPredictions, int width, int height, int numOfClasses) throws NullPointerException {
		if (samplesData == null || samplesPredictions == null ) {
			throw new NullPointerException();
		}
		int[]pixels = samplesData.asInt();
		float[][] predictions = samplesPredictions.toFloatMatrix();
		for (int i = 0; i < 10; i++) {
			int[] samplePixels = Arrays.copyOfRange(pixels, width * height * i, width * height * (i + 1) );
			float[] samplePrediction = predictions[i];
			showJFrame(getImageFromArray(samplePixels, width, height), samplePrediction);
		}
	}
	
	private static void showJFrame(Image image, float[] predictions) {

		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(400, 400));

		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.getContentPane().add(new JLabel(new ImageIcon(image)));

		for (int i = 0; i < predictions.length; i++) {
			JLabel label = new JLabel("Pravdepodobnost, ze jde o cislo " + i + " = " + predictions[i]);
			frame.getContentPane().add(label);

		}
		frame.pack();
		frame.setVisible(true);
	}

	private static Image getImageFromArray(int[] pixels, int width, int height) {
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
		WritableRaster raster = (WritableRaster) image.getData();
		raster.setPixels(0, 0, width, height, pixels);
		image.setData(raster);
		return image;
	}
}
