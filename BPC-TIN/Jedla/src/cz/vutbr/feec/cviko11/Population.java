package cz.vutbr.feec.cviko11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Population {

	private ArrayList<Chromozome> chromo = new ArrayList<Chromozome>();
	private int startingPopulation;

	// constructor for create population by size declared by user
	public Population(int size) {
		this.startingPopulation = size;
		for (int i = 0; i < size; i++) {
			Chromozome ch = new Chromozome();
			ch.mutateAll();
			chromo.add(ch);
		}
	}

	// cross population randomly between 2 chromozome
	// number of crosses is defined by user
	public void populationCross(int numberOfCross) {
		for (int i = 0; i < numberOfCross; i++) {
			Chromozome ch1 = chromo.get(new Random().nextInt(chromo.size()));
			Chromozome ch1Clone = ch1.cloneChromozome();
			Chromozome ch2 = chromo.get(new Random().nextInt(chromo.size()));
			Chromozome ch2Clone = ch2.cloneChromozome();

			ch1Clone.crossOver(ch2Clone);
			this.add(ch1Clone);
			this.add(ch2Clone);
		}
	}

	// mutate multiple part of chromozome and add to population
	public void mutateChromozomes(int numberOfMutate, double probability) {
		for (int i = 0; i < numberOfMutate; i++) {
			Chromozome ch1 = chromo.get(new Random().nextInt(chromo.size()));
			Chromozome ch1Clone = ch1.cloneChromozome();
			ch1Clone.mutate(probability);
			this.add(ch1Clone);
		}
	}

	// muted multiple chromozome and add to population
	public void mutateChromozomesAll(int numberOfMutate) {
		for (int i = 0; i < numberOfMutate; i++) {
			Chromozome ch1 = chromo.get(new Random().nextInt(chromo.size()));
			Chromozome ch1Clone = ch1.cloneChromozome();
			ch1Clone.mutateAll();
			this.add(ch1Clone);
		}
	}

	// get chromozome of population by index
		public Chromozome get(int index) {
			return chromo.get(index);
		}
	// add chromozome to population
	public void add(Chromozome ch) {
		chromo.add(ch);
	}

	// remove specific chromozome
	public void remove(Chromozome ch) {
		chromo.remove(ch);
	}

	// remove specific chromozome
	public void removeByID(int index) {
		chromo.remove(index);
	}

	// get chromozome size
	public int size() {
		return chromo.size();
	}

	public Chromozome getNejlepsiChromozom() {
		Collections.sort(chromo, new ChromoComparator());
		return chromo.get(0);
	}

	public Population newPopulationTurnamentForBestChromo() throws IOException {
		Fitness eval = new Fitness("image/orloj.jpg");
		Random rnd = new Random();
		Population p = new Population(0);
		p.setStartingPopulation(startingPopulation);
		for (int i = 0; i < startingPopulation; i++) {
			int nahodnyIndex1 = rnd.nextInt(chromo.size());
			Chromozome ch1 = chromo.get(nahodnyIndex1);
			chromo.remove(ch1);

			int nahodnyIndex2 = rnd.nextInt(chromo.size());
			Chromozome ch2 = chromo.get(nahodnyIndex2);
			chromo.remove(ch2);

			if (eval.getFitness(ch1) < eval.getFitness(ch2)) {
				p.add(ch1);
			} else {
				p.add(ch2);
			}
		}
		return p;
	}

	public int getStartingPopulation() {
		return startingPopulation;
	}

	public void setStartingPopulation(int startingPopulation) {
		this.startingPopulation = startingPopulation;
	}
	
}
