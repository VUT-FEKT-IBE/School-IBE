package cz.vutbr.feec.cviko9;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Path implements Comparable<Path> {
	private Graph graph;
	private Node lastNode = null;
	private Vector<Node> nodes = new Vector<Node>();
	private int cost = 0; // actual cost
	private int rounds1; // counter for A*
	private int rounds2; // counter for Dijkstra's

	public Path(Graph graph) {
		super();
		this.graph = graph;
	}

	// A* algorithm if find return path else return null
	public Path getPathByAstar(String from, String to) {
		this.rounds1 = 0; // for new incrementation
		// Checking if destination exist in graph if not return null
		if (graph.isInGraph(to) == false) {
			System.out.println("destination doesn't exist for A*");
			return null;
		}
		Queue<Path> queue = new LinkedList<Path>();
		Path p = new Path(graph);
		p.addNode(from);
		queue.add(p);
		while (queue.isEmpty() != true) {
			Path tmp = queue.remove();
			// if branch ended in final destination return path as reference
			if (tmp.isAtDestination(to)) {
				return tmp;
			}
			tmp.getLastNode().getSmallestCostIndex();
			// iterate over index of smallest cost for multiple scenarios
			for (Integer n : tmp.getLastNode().getSmallestCostsIndex()) {
				String data = tmp.getLastNode().getNeighbors().get(n).getData();
				Path cp = tmp.cloneAndAdd(data); // clone of actual path + new possibility
				queue.add(cp);
			}
			rounds1++;
		}
		return null;
	}

	// Dijkstra's algorithm if find return path else return null
	public Path getPathDijkstras(String from, String to) {
		this.rounds2 = 0; // for new incrementation
		// Checking if destination exist in graph if not return null
		if (graph.isInGraph(to) == false) {
			System.out.println("destination doesn't exist for Dijkstra's");
			return null;
		}
		PriorityQueue<Path> queue = new PriorityQueue<Path>();
		Path p = new Path(graph);
		p.addNode(from);
		queue.add(p);
		while (queue.isEmpty() != true) {
			Path tmp = queue.remove();
			// if branch ended in final destination return path as reference
			if (tmp.isAtDestination(to)) {
				return tmp;
			}
			// iterate over all neighbors to crate new paths
			for (Node n : tmp.getLastNode().getNeighbors()) {
				Path cp = tmp.cloneAndAdd(n.getData()); // clone of actual path + new possibility
				queue.add(cp);
			}
			rounds2++;
		}
		return null;
	}

	// clone path and add new node to path return new path
	public Path cloneAndAdd(String data) {
		Path cp = new Path(graph);
		cp.lastNode = lastNode;
		cp.cost = cost;
		cp.nodes.addAll(nodes);
		cp.addNode(data);
		return cp;

	}

	// find if path is in final destination if not return false
	public boolean isAtDestination(String dest) {
		if (lastNode == null) {
			return false;
		} else {
			return dest.equals(lastNode.getData());
		}
	}

	// add node to path and set actual cost of path
	public void addNode(String data) {
		Node n = graph.getUzel(data);
		if (lastNode == null) {
			cost = 0;
		} else {
			cost = cost + lastNode.getCost(n);
		}
		lastNode = n;
		nodes.add(n);
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Node getLastNode() {
		return lastNode;
	}

	public void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}

	public Graph getGraph() {
		return graph;
	}

	public void setGraph(Graph graph) {
		this.graph = graph;
	}

	public Vector<Node> getNodes() {
		return nodes;
	}

	public void setNodes(Vector<Node> nodes) {
		this.nodes = nodes;
	}

	public int getRounds1() {
		return rounds1;
	}

	public void setRounds1(int rounds1) {
		this.rounds1 = rounds1;
	}

	public int getRounds2() {
		return rounds2;
	}

	public void setRounds2(int rounds2) {
		this.rounds2 = rounds2;
	}

	@Override
	public int compareTo(Path arg0) {
		Integer c1 = cost;
		Integer c2 = arg0.cost;
		return c1.compareTo(c2);
	}

	@Override
	public String toString() {
		return nodes.toString();
	}

}
