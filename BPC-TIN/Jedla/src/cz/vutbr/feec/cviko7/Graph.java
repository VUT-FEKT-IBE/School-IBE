package cz.vutbr.feec.cviko7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	// next object for test
	Queue<Jugs> open = new LinkedList<Jugs>();
	// list of all possibilities which we visit
	List<int[]> closed = new ArrayList<int[]>();

	// check if new edge is all ready in closed list
	private boolean isInClosed(int[] comparison) {
		for (int[] values : closed) {
			if (Arrays.equals(comparison, values)) {
				return true;
			}
		}
		return false;
	}

	// copy data from parent to child because can`t copy object due to reference
	public void copyObject(Jugs from, Jugs to) {
		to.getA().setVolume(from.getA().getVolume());
		to.getB().setVolume(from.getB().getVolume());
	}

	// show path from result to start
	public void printPath(Jugs jugs) {
		Jugs tmp = jugs;
		while (tmp != null) {
			System.out.println(tmp);
			tmp = tmp.getParent();
		}
	}

	// find shortest route to number
	public void find(int number, Jugs top) {
		Jugs tmp;
		// to set maximal jug when createn new object
		int MaxjugA = top.getA().getMaxVolume();
		int MaxjugB = top.getB().getMaxVolume();
		// add start to queue
		open.add(top);
		while (true) {
			// get object from queue
			tmp = open.poll();
			// testing queue if is all branches duplicit end and print
			if (tmp == null) {
				System.out.println("can`t find a way to number: " + number);
				break;
			}
			// set up help and add to closed list
			int[] closedTmp = { tmp.getA().getVolume(), tmp.getB().getVolume() };
			closed.add(closedTmp);
			// testing for result
			if ((tmp.getA().getVolume() == 0 && tmp.getB().getVolume() == number)
					|| (tmp.getA().getVolume() == number && tmp.getB().getVolume() == 0)) {
				this.printPath(tmp);
				break;
			}
			// empty try both variant
			for (int i = 0; i < 2; i++) {
				Jugs a = new Jugs(MaxjugA, MaxjugB);
				this.copyObject(tmp, a);
				a.emptyJug(i);
				int[] help = { a.getA().getVolume(), a.getB().getVolume() };
				if (i == 0) {
					// if not in closed create new object and set parent and for parent set child
					if (this.isInClosed(help) != true) {
						a.setParent(tmp);
						a.setOperation("empty A");
						tmp.setEmptyA(a);
						open.add(a);
					}
				} else {
					if (this.isInClosed(help) != true) {
						a.setParent(tmp);
						a.setOperation("empty B");
						tmp.setEmptyB(a);
						open.add(a);
					}
				}
			}
			// fill try both variant and same as empty
			for (int i = 0; i < 2; i++) {
				Jugs a = new Jugs(MaxjugA, MaxjugB);
				this.copyObject(tmp, a);
				a.spillJug(i);
				int[] help = { a.getA().getVolume(), a.getB().getVolume() };
				if (i == 0) {
					if (this.isInClosed(help) != true) {
						a.setParent(tmp);
						a.setOperation("spill from A to B");
						tmp.setSpillA(a);
						open.add(a);
					}
				} else {
					if (this.isInClosed(help) != true) {
						a.setParent(tmp);
						a.setOperation("spill from B to A");
						tmp.setSpillB(a);
						open.add(a);
					}
				}
			}
			// pour try both variant same as empty
			for (int i = 0; i < 2; i++) {
				Jugs a = new Jugs(MaxjugA, MaxjugB);
				this.copyObject(tmp, a);
				a.pourJug(i);
				int[] help = { a.getA().getVolume(), a.getB().getVolume() };
				if (i == 0) {
					if (this.isInClosed(help) != true) {
						a.setParent(tmp);
						a.setOperation("pour A");
						tmp.setPourA(a);
						open.add(a);
					}
				} else {
					if (this.isInClosed(help) != true) {
						a.setParent(tmp);
						a.setOperation("pour B");
						tmp.setPourB(a);
						open.add(a);
					}
				}
			}

		}
	}

}
