package cz.vutbr.feec.cviko3;

public abstract class Object {
	private int x;
	private int xside;
	private int yside;

	public Object() {
		super();
	}
	
	public int getXside() {
		return xside;
	}

	public void setXside(int xside) {
		this.xside = xside;
	}

	public int getYside() {
		return yside;
	}

	public void setYside(int yside) {
		this.yside = yside;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void PrintObject(int x) {
		System.out.println(x);
	}

	@Override
	public String toString() {
		return "x=" + x + " ";
	}
	
	public abstract void printObj();
}
