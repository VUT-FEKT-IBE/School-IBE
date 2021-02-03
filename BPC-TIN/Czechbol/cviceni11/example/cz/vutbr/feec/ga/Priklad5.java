package cz.vutbr.feec.ga;

import java.io.IOException;

/**
 * Tento priklad ukazuje jak krizit dva chromozomy a soucasne ponechat rodice.
 */
public class Priklad5 {
	public static void main(String[] args) throws IOException {
		Chromozome ch1 = new Chromozome();
		ch1.mutateAll();

		Chromozome ch2 = new Chromozome();
		ch2.mutateAll();
		
		// Vytvoreni kopii
		Chromozome ch1Clone = ch1.cloneChromozome();
		Chromozome ch2Clone = ch2.cloneChromozome();

		// krizeni zkombinuje potomky
		ch1Clone.crossOver(ch2Clone);
	}
}
