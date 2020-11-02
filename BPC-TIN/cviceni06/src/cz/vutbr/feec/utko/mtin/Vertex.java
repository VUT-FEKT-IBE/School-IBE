package cz.vutbr.feec.utko.mtin;

import java.util.HashMap;
import java.util.HashSet;

public class Vertex {
	private String name;
	private HashSet<Vertex> vertexSet = new HashSet<Vertex>();
	private HashMap<Vertex, Integer> costs = new HashMap<Vertex, Integer>();
	
	public String getName() {
		return name;
	}

	public Vertex(String name) {
		super();
		this.name = name;
	}

	public int getCost(Vertex v2) {
		return costs.get(v2);
	}

	public void addConnection(Vertex v2, int cost) {
		vertexSet.add(v2);
		costs.put(v2, cost);
	}
	
}
