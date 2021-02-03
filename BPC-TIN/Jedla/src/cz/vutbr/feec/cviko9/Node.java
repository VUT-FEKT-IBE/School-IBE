package cz.vutbr.feec.cviko9;

import java.util.Vector;

public class Node {
	private static final int INFINITY = Integer.MAX_VALUE; // maximal int value
	private String data; // name of node
	private Vector<Node> neighbors = new Vector<Node>(); // neighbors database
	private Vector<Integer> costs = new Vector<Integer>(); // cost for path to neighbors
	private Vector<Integer> SmallestCostsIndex = new Vector<Integer>(); // contains index of all smallest costs

	public Node(String data) {
		super();
		this.data = data;
	}

	// adding to database so neighbor node and their cost have same index value
	public void add(Node n1, int cost) {
		neighbors.add(n1);
		costs.add(cost);
	}

	// getting cost of path between 2 nodes
	public int getCost(Node n) {
		int index = neighbors.indexOf(n);
		// if node doesn't exit return int max value
		if (index == -1) {
			return INFINITY;
		}
		// return cost of path
		else {
			return costs.get(index);
		}

	}

	// add all index of smallest cost to Vector
	public void getSmallestCostIndex() {
		SmallestCostsIndex.clear(); // clear vector
		int cost = Integer.MAX_VALUE;
		for (int i = 0; i < costs.size(); i++) {
			if (costs.get(i) <= cost) {
				if (costs.get(i) == cost) {
					SmallestCostsIndex.add(i);
				} else {
					SmallestCostsIndex.clear();
					cost = costs.get(i);
					SmallestCostsIndex.add(i);
				}
			}
		}
	}

	// return smallest cost of path between nodes
	public int getSmallestCost() {
		int smallestCost = Integer.MAX_VALUE;
		for (Integer i : costs) {
			if (i < smallestCost) {
				smallestCost = i;
			}
		}
		return smallestCost;
	}

	// get neighbor by index
	public Node getNeighbor(int index) {
		return neighbors.get(index);
	}

	// get number of neighbors
	public int NumberOfNeighbours() {
		return neighbors.size();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static int getInfinity() {
		return INFINITY;
	}

	public Vector<Node> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(Vector<Node> neighbors) {
		this.neighbors = neighbors;
	}

	public Vector<Integer> getCosts() {
		return costs;
	}

	public void setCosts(Vector<Integer> costs) {
		this.costs = costs;
	}

	public Vector<Integer> getSmallestCostsIndex() {
		return SmallestCostsIndex;
	}

	public void setSmallestCostsIndex(Vector<Integer> smallestCostsIndex) {
		SmallestCostsIndex = smallestCostsIndex;
	}

	@Override
	public String toString() {
		return data + "-";
	}

}
