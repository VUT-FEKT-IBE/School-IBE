import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

@SuppressWarnings("unused")
public class Population {
	public TreeSet<Chromozome> population = new TreeSet<Chromozome>();
	private int generation = 0;
	public int size;
	
	public Population (int size) throws IOException {
		this.size = size;
		for (int i = 0; i < size; i++) {
			this.population.add(new Chromozome().mutateAll());
		}
	}
	
	public void nextGeneration () throws IOException {
		this.generation++;
		this.crossOver(128);
		this.mutate(128);
		this.clean();
		this.showBest();
		System.out.format("Generation %d: fitness %d\n",
				this.generation, this.population.first().getFitness());
	}
	
	private void crossOver (int count) throws IOException {
		for (int i = 0; i < count; i++) {
			Chromozome ch1 = this.getRandom().copy();
			Chromozome ch2 = this.getRandom().copy();
			ch1.crossOver(ch2);
			this.population.add(ch1);
			this.population.add(ch2);
		}
	}
	
	private void mutate (int count) throws IOException {
		for (int i = 0; i < count; i++) {
			this.population.add(this.getRandom().copy().mutate());
		}
	}
	
	private void clean () {
		while (this.population.size() > this.size) {
			this.population.remove(this.population.last());
		}
	}
	
	private Chromozome getRandom () {
		Random rnd = new Random();
		return (Chromozome) this.population.toArray()[rnd.nextInt(this.population.size())];
	}
	
	private void showBest () {
		ShowChromozome.show(this.population.first(),
			String.format("Generation %d", this.generation));
	}
}
