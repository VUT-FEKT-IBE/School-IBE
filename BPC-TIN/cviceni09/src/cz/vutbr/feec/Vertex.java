package cz.vutbr.feec;

import java.util.Vector;

public class Vertex {
	private static final int INFINITE = 99999;
	
	private String data;
	private Vector<Vertex> neighbours = new Vector<Vertex>();
	private Vector<Integer> costs = new Vector<Integer>();
	

	public Vertex(String name) {
		super();
		this.data = name;
	}

	public int getCost(Vertex v2) {
		int index = neighbours.indexOf(v2);
		if(index == -1) {
			return INFINITE;
		}
		return costs.get(index);
	}
	
	public Vertex getNeighbour (int index) {
		return neighbours.get(index);
	}
	
	public int getNeighbourCount () {
		return neighbours.size();
	}
	
	public Vector<Vertex> getNeighbours () {
		return neighbours;
	}

	public void addNeighbour(Vertex v2, int cost) {
		neighbours.add(v2);
		costs.add(cost);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
    public Vector<Integer> getCosts() {
        return costs;
    }

    public void setCosts(Vector<Integer> costs) {
        this.costs = costs;
    }
	
}
