package cz.vutbr.feec.cviko9;

public class Main {
	static String getAlphaNumericString() {

		// chose a Character random from this String
		String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 1; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// default graph structure
		Graph g = new Graph();
		g.add("a", "b", 11);
		g.add("a", "e", 9);
		g.add("a", "c", 4);
		g.add("b", "e", 2);
		g.add("b", "d", 2);
		g.add("c", "d", 7);
		g.add("c", "e", 2);
		g.add("d", "e", 8);

		// testing part of Dijkstra's algorithms

		/***
		 * Path p = new Path(g); p.addNode("a"); p.addNode("e");
		 * System.out.println(p.isAtDestination("b")); p.addNode("b");
		 * System.out.println(p.isAtDestination("b")); System.out.println("my cost: " +
		 * p.getCost()); for (Node n : p.getLastNode().getNeighbors()) { Path cp =
		 * p.cloneAndAdd(n.getData()); String NameOfNode = cp.getLastNode().getData();
		 * System.out.println("Copy: a-e-b-" + NameOfNode + " cost: " + cp.getCost());
		 * 
		 * }
		 * 
		 * PriorityQueue<Path> queue = new PriorityQueue<Path>(); queue.add(p);
		 * queue.add(p.cloneAndAdd("a")); queue.add(p.cloneAndAdd("e"));
		 * queue.add(p.cloneAndAdd("d"));
		 * 
		 * while (!queue.isEmpty()) { Path tmp = queue.remove(); System.out.println(tmp
		 * + " cost: " + tmp.getCost()); }
		 **/

		// algorithm
		Path test = new Path(g);
		// Dijkstra's
		Path tmp = test.getPathDijkstras("a", "d");
		System.out.println(tmp + " number of cycle for Dijkstra's: " + test.getRounds2());
		// A*
		tmp = test.getPathByAstar("a", "d");
		System.out.println(tmp + " number of cycle for A*: " + test.getRounds1());

		System.out.println(); // for better reading

		// Own graph structure
		Graph g2 = new Graph();
		g2.add("a", "b", 11);
		g2.add("a", "e", 9);
		g2.add("a", "c", 4);

		g2.add("b", "e", 2);
		g2.add("b", "d", 2);
		g2.add("b", "f", 5);

		g2.add("c", "d", 7);
		g2.add("c", "e", 2);
		g2.add("c", "g", 8);

		g2.add("d", "e", 8);
		g2.add("d", "f", 2);
		g2.add("d", "g", 16);

		g2.add("e", "f", 5);
		g2.add("e", "g", 10);

		g2.add("f", "g", 1);

		Path test2 = new Path(g2);
		// Dijkstra's
		Path tmp2 = test2.getPathDijkstras("a", "f");
		System.out.println(tmp2 + " number of cycle for Dijkstra's: " + test2.getRounds2());
		// A*
		tmp2 = test2.getPathByAstar("a", "f");
		System.out.println(tmp2 + " number of cycle for A*: " + test2.getRounds1());

		System.out.println(); // for better reading

		// testing for non-existence node both algorithms
		tmp2 = test2.getPathDijkstras("a", "r");
		System.out.println(tmp2 + " number of cycle for Dijkstra's: " + test2.getRounds2());
		// A*
		tmp2 = test2.getPathByAstar("a", "r");
		System.out.println(tmp2 + " number of cycle for A*: " + test2.getRounds1());
	}

}
