package cz.vutbr.feec.ga;

import java.io.IOException;

/**
 * Tento priklad ukazuje jak krizit dva chromozomy a soucasne ponechat rodice.
 */
public class Priklad6 {
	public static void main(String[] args) throws IOException {
		// Priklad 5
		Chromozome ch1 = new Chromozome();
		ch1.mutateAll();

		Chromozome ch2 = new Chromozome();
		ch2.mutateAll();

		Chromozome ch1Clone = ch1.cloneChromozome();
		Chromozome ch2Clone = ch2.cloneChromozome();

		ch1Clone.crossOver(ch2Clone);

		// Ohodnoceni kvality jednotlivych reseni
		Fitness eval = new Fitness("image/orloj.jpg");

		System.out.println("Nejlepsi je chromozom s nejmensi "
				+ "chybou oproti predloze:");
		System.out.println("Fitness ch1: " + eval.getFitness(ch1));
		System.out.println("Fitness ch2: " + eval.getFitness(ch2));
		System.out.println("Fitness ch1Clone: " + eval.getFitness(ch1Clone));
		System.out.println("Fitness ch2Clone: " + eval.getFitness(ch2Clone));

		// zobraz
		ShowChromozome.show(ch1, "Ch 1");
		ShowChromozome.show(ch2, "Ch 2");
		ShowChromozome.show(ch1Clone, "Ch 1 clone");
		ShowChromozome.show(ch2Clone, "Ch 2 clone");
	}
}
