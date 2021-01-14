package GrEditor;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Kruh extends GrObjekt {
	private int prumer;
	
	@Override
	public void vykresli(Graphics2D g2d) {	
		Shape kruh = new Ellipse2D.Double(prumer, prumer, x, y);
		g2d.draw(kruh);
	}

	public Kruh(int x, int y, int d) {
		super(x, y);
		this.prumer = d;
	}

	public int getPrumer() {
		return prumer;
	}

	public void setPrumer(int prumer) {
		this.prumer = prumer;
	}



}
