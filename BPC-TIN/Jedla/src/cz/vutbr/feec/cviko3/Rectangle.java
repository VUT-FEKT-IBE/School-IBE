package cz.vutbr.feec.cviko3;

public class Rectangle extends Object {

	private int y;

	public Rectangle(int y) {
		super();
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Rectangle y= " + y + ", x= " + getX() + " ";
	}

	public void print() {

	}

	@Override
	public void printObj() {
		System.out.println("Rectangle: size x " + this.getXside());

	}
}
