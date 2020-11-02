package cz.vutbr.feec;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.add("A", "B", 11);
		g.add("A", "E", 9);
		g.add("A", "C", 4);
		g.add("B", "D", 2);
		g.add("B", "E", 2);
		g.add("C", "D", 7);
		g.add("C", "E", 2);
		g.add("D", "E", 8);
		
		Path p = new Path(g);
		p.addVertex("A");
		p.addVertex("E");
		p.addVertex("D");
		System.out.println("Puvodni: A-E-D cena: "+p.getCost());
		
		
		Path p2 = new Path(g);
        System.out.println(p2.getPath("A", "C"));

	}

}
