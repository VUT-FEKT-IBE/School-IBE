package cz.vutbr.feec.ga;

import java.io.IOException;

/**
 * Tento priklad zobrazuje miru podobnosti vuci predloze.
 */
public class Priklad2 {
	public static void main(String[] args) throws IOException {
		// Priklad 1
		Chromozome ch1 = new Chromozome();
		ch1.mutateAll();

		// Porovnavaci trida vuci obrazku orloj.jpg
		Fitness eval = new Fitness("image/orloj.jpg");

		// poorvnej
		int error = eval.getFitness(ch1);

		System.out.println("Mira chyby vuci predloze: " + error);
	}
}
