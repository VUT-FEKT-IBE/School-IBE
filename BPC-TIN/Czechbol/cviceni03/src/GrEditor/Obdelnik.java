package GrEditor;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Obdelnik extends GrObjekt {
	private int vyska;
	private int delka;
	
	public Obdelnik(int x, int y, int a, int b) {
		super(x, y);
		this.vyska = a;
		this.delka = b;
	}
	
	@Override
	public void vykresli(Graphics2D g2d) {
		Shape obdelnik = new Rectangle2D.Double(delka, vyska, x, y);	
		g2d.draw(obdelnik);
	}
	
	public int getVyska() {
		return vyska;
	}

	public void setVyska(int vyska) {
		this.vyska = vyska;
	}

	public int getDelka() {
		return delka;
	}

	public void setDelka(int delka) {
		this.delka = delka;
	}

}
