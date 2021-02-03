package cz.vutbr.feec.cviko11;

import java.util.Random;

public class Chromozome {
	public static final int NUM_OF_POLYG = 30;
	public static final int NUM_OF_POINTS = 5;
	// jeden polygon zabira 14 polozek
	public static int POLY_LENGTH = (NUM_OF_POINTS * 2 + 3 + 1);
	// body x, y, bravy R,G,B + ALPHA
	private int[] data = new int[NUM_OF_POLYG * (NUM_OF_POINTS * 2 + 3 + 1)]; // 420

	public int getData(int index) {
		return data[index];
	}

	public void crossOver(Chromozome ch) {
		Random rnd = new Random();

		// pro kazdy polygon
		for (int i = 0; i < NUM_OF_POLYG; i++) {
			// nahodne
			if (rnd.nextBoolean()) {
				// prohod polygony
				for (int j = 0; j < POLY_LENGTH; j++) {
					// prohod
					int tmp = data[i * POLY_LENGTH + j];
					data[i * POLY_LENGTH + j] = ch.data[i * POLY_LENGTH + j];
					ch.data[i * POLY_LENGTH + j] = tmp;
				}
			} else {
				// ponech jak je
			}
		}
	}

	/**
	 * Mutuj vsechny geny tohoto chromozomu.
	 */
	public void mutateAll() {
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(256);
		}
	}

	public void mutate(double probability) {
		Random rnd = new Random();
		for (int j = 0; j < NUM_OF_POLYG; j++) {
			if (rnd.nextDouble() < probability) {
				for (int j2 = 0; j2 < POLY_LENGTH; j2++) {
					data[POLY_LENGTH*j+j2] = rnd.nextInt(256);
				}
			}
		}
	}

	public Chromozome cloneChromozome() {
		Chromozome ch = new Chromozome();
		ch.data = data.clone();
		return ch;
	}
	
	

}
