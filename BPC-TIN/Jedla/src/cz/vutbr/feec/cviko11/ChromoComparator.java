package cz.vutbr.feec.cviko11;

import java.io.IOException;
import java.util.Comparator;

public class ChromoComparator implements Comparator<Chromozome> {
	private Fitness eval;

	public ChromoComparator() {
		try {
			eval = new Fitness("image/orloj.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int compare(Chromozome ch1, Chromozome ch2) {
		Integer i1 = eval.getFitness(ch1);
		Integer i2 = eval.getFitness(ch2);
		return i1.compareTo(i2);
	}
}
