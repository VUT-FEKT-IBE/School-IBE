package cz.vutbr.feec;

import java.util.PriorityQueue;
import java.util.Vector;

public class Path implements Comparable<Path> {
	private Graph graph;
	private Vertex lastVertex = null;
	private Vector<Vertex> vertices = new Vector<Vertex>();
	private int cost;
	

	public void addVertex (String name) {
		Vertex n = graph.getNode(name);
		
		if (this.lastVertex == null) {
			cost = 0;
		} else {
			cost += lastVertex.getCost(n);
		}
		
		lastVertex = n;
		vertices.add(n);
	}
	
	public boolean isAtDestination (String destination) {
		if (lastVertex == null) {
			return false;
		} else {
			return destination.equals(lastVertex.getData());
		}
	}
	
	public Path cloneAndAddVertex(String vertexname) {
		Path copy = new Path(graph);
		copy.lastVertex = lastVertex;
		copy.cost = cost;
		copy.vertices.addAll(vertices);
		
		copy.addVertex(vertexname);
		return copy;
		
	}
	
	public Path getPath(String odkud, String kam) {
		PriorityQueue<Path> prioFronta = new PriorityQueue<Path>();
		Path c = new Path(graph);
		c.addVertex(odkud);
		prioFronta.add(c);

		while (!prioFronta.isEmpty()) {
			Path tmp = prioFronta.remove();
			if (tmp.isAtDestination(kam)) {

				return tmp;
			}
			for (Vertex v : tmp.getLast().getNeighbours()) {
				Path kopie = tmp.cloneAndAddVertex(v.getData());
				String nazevUzlu = kopie.getLast().getData();
				System.out.println("Kopie: A-E-B-" + nazevUzlu + " cena=" + kopie.getCost());
				prioFronta.add(kopie);
			}

		}
		return null;

	}
	
	public Vertex getLast() {
		return this.lastVertex;
	}
	
	public int getCost () {
		return this.cost;
	}
	
	public Path (Graph g) {
		this.graph = g;
	}
	
	@Override
	public String toString() {
		for (Vertex v : vertices) {
			System.out.print(v.getData() + "-");
		}
		System.out.print("cena=" + this.getCost());
		return "";
	}

	@Override
	public int compareTo(Path arg0) {
		Integer c1 = cost;
		Integer c2 = arg0.cost;
		return c1.compareTo(c2);
	}
}
