package cz.vutbr.feec;

import java.util.HashMap;

public class Graph {
	private HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();
	
	public Vertex getNode(String name) {
		return vertices.get(name);
	}
	
	public Vertex getVertex(String name) {
		return vertices.get(name);
	}
	
	public void add(String v1Name, String v2Name, int cost) {
		Vertex v1 = vertices.get(v1Name);
		Vertex v2 = vertices.get(v2Name);
		if(v1 == null) {
			v1 = new Vertex(v1Name);
			vertices.put(v1Name, v1);
		}
		if(v2 == null) {
			v2 = new Vertex(v2Name);
			vertices.put(v2Name, v2);
		}
		v1.addNeighbour(v2, cost);
		v2.addNeighbour(v1, cost);
	}

}
