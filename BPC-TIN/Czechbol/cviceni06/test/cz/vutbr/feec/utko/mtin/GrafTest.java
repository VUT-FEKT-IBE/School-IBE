package cz.vutbr.feec.utko.mtin;

import junit.framework.TestCase;

public class GrafTest extends TestCase {
	public void testGraph() {
		Graph g = new Graph();
		g.add("1", "2", 4);
		g.add("1", "6", 6);
		g.add("1", "7", 16);
		
		Vertex v1 = g.getVertext("1");
		Vertex v2 = g.getVertext("2");
		Vertex v3 = g.getVertext("7");
		
		int cost = v1.getCost(v2);
		assertEquals(4, cost);
		assertEquals(4, v1.getCost(v3));
	}
}
