package cz.vutbr.feec.ga;

import java.io.IOException;

/**
 * Priklad zobrazuje jak vytvorit objekt chromozom a zobrazit je do platna.
 */
public class Priklad1 {
	public static void main(String[] args) throws IOException {
		// Vytvor chromozom
		Chromozome ch1 = new Chromozome();

		// znahodni jeho obsah
		ch1.mutateAll();

		// zobraz
		ShowChromozome.show(ch1, "Ch 1");
	}
}
