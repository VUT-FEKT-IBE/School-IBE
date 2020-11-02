package GrEditor;

import java.awt.Graphics2D;

public abstract class GrObjekt {
	protected int x;
	protected int y;
	
	public GrObjekt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract void vykresli(Graphics2D g2d);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
