package cz.vutbr.feec.utko.mtin;

import java.util.HashMap;

public class Graph {
	private HashMap<String, Vertex> vertexSet = new HashMap<String, Vertex>();
	public void add(String v1Name, String v2Name, int cost) {
		Vertex v1 = vertexSet.get(v1Name);
		Vertex v2 = vertexSet.get(v2Name);
		if(v1 == null) {
			v1 = new Vertex(v1Name);
			vertexSet.put(v1Name, v1);
		}
		if(v2 == null) {
			v2 = new Vertex(v2Name);
			vertexSet.put(v2Name, v2);
		}
		v1.addConnection(v2, cost);
	}
	public Vertex getVertext(String name) {
		return vertexSet.get(name);
	}

}
