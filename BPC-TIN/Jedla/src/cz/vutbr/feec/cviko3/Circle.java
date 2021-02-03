package cz.vutbr.feec.cviko3;

public class Circle extends Object {

	private int r;
	
	public Circle(int r) {
		super();
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "circle r= " + r + " ";
	}
	@Override
	public void printObj() {
		System.out.println("circle : size x " + this.getXside());

	}
}
