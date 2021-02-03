package cz.vutbr.feec.cviko9;

import java.util.HashMap;

public class Graph {
	private HashMap<String, Node> nodes = new HashMap<String, Node>(); // #map for finding by data aka name

	// testing if the data is in nodes if not return false
	public boolean isInGraph(String data) {
		Node n = nodes.get(data);
		if (n == null) {
			return false;
		}
		return true;
	}

	// finding if node exist in #map if not returning null
	public Node getUzel(String data) {
		return nodes.get(data);
	}

	// add or create new node to #map and set them as neighbors
	public void add(String data1, String data2, int cost) {
		Node n1 = nodes.get(data1);
		if (n1 == null) {
			Node nn1 = new Node(data1);
			nodes.put(data1, nn1);
			n1 = nn1;
		}
		Node n2 = nodes.get(data2);
		if (n2 == null) {
			Node nn2 = new Node(data2);
			nodes.put(data2, nn2);
			n2 = nn2;
		}

		n1.add(n2, cost);
		n2.add(n1, cost);
	}

	public HashMap<String, Node> getNodes() {
		return nodes;
	}

	public void setNodes(HashMap<String, Node> nodes) {
		this.nodes = nodes;
	}

}
