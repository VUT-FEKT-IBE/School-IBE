package cz.vutbr.feec.ga;

import java.io.IOException;

/**
 * Tento priklad ukazuje jak klonovat chromozom.
 */
public class Priklad3 {
	public static void main(String[] args) throws IOException {
		// Priklad 1
		Chromozome ch1 = new Chromozome();
		ch1.mutateAll();

		// vytvoreni kopie
		Chromozome ch2 = ch1.cloneChromozome();
		// Chromozome ch2 = ch1; // nevytvori kopii
		
		ShowChromozome.show(ch1, "Chromozom ch1");
		ShowChromozome.show(ch2, "Chromozom ch2");
	}
}
