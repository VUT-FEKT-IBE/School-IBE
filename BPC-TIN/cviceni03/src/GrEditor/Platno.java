package GrEditor;

import java.util.Vector;

import javax.imageio.ImageIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Platno {
	private int vyska;
	private int sirka;
	
	public Platno(int vyska, int sirka) {
		super();
		this.vyska = vyska;
		this.sirka = sirka;
	}
	
	private Vector<GrObjekt> objekty = new Vector<>();
	
	public void pridej(GrObjekt o) {
		objekty.add(o);
	}
	
	public void vytvorRastr() {
		BufferedImage bim = new BufferedImage(vyska, sirka, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = (Graphics2D) bim.getGraphics();
		
		for (GrObjekt o : objekty) {
			o.vykresli(g2d);
			}
		File outputFile = new File ("image.png");
		try {
			ImageIO.write(bim, "png", outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
	}
		

}

