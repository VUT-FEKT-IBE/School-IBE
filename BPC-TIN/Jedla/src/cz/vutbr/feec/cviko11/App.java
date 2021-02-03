package cz.vutbr.feec.cviko11;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		Population p = new Population(100);
		for (int i = 0; i < 100; i++) {
			p.populationCross(50);
			p.mutateChromozomes(50, 2./50.);
			p = p.newPopulationTurnamentForBestChromo();
			if (i % 20 == 0) {
				Chromozome nejlepsi = p.getNejlepsiChromozom();
				Fitness eval = new Fitness("image/orloj.jpg");
				long error = eval.getFitness(nejlepsi);

				ShowChromozome.show(nejlepsi, "Nejlepsi z evoluce " + i + " f="
						+ error);
				System.out.println(error);
			}}
	}

}
