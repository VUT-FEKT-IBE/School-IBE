package GrEditor;

import java.awt.Graphics2D;
import java.util.Vector;

public class Slozenina extends GrObjekt {

	public Slozenina(int x, int y) {
		super(x, y);
	}

	private Vector<GrObjekt> slozenina = new Vector<>();

	public void pridej(GrObjekt o) {
		slozenina.add(o);
	}

	@Override
	public void vykresli(Graphics2D g2d) {
		for (GrObjekt o : slozenina) {
			o.vykresli(g2d);
		}
	}
}
