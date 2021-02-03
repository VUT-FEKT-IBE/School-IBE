package cz.vutbr.feec.cviko11;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Tato trida slouzi pouze pro vizualizaci vysledu - netreba ji rozmet.
 * 
 */
public class ShowChromozome extends JPanel {
	private static final long serialVersionUID = 1L;
	private Chromozome chromozome;

	public ShowChromozome(Chromozome ch) {
		this.chromozome = ch;
		setSize(256, 256);
		setPreferredSize(new Dimension(256, 256));
	}

	public void paintComponent(Graphics g) {
		drawGraphics(g, chromozome);
	}

	public static void drawGraphics(Graphics g, Chromozome chromozome) {
		// vymazaat platno
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 256, 256);

		// vykresli polygony
		int index = 0;
		for (int i = 0; i < Chromozome.NUM_OF_POLYG; i++) {
			Polygon poly = new Polygon();
			for (int j = 0; j < Chromozome.NUM_OF_POINTS; j++) {
				poly.addPoint(chromozome.getData(index),
						chromozome.getData(index + 1));
				index += 2;
			}
			Color c = new Color(chromozome.getData(index),
					chromozome.getData(index + 1),
					chromozome.getData(index + 2),
					chromozome.getData(index + 3));
			index += 4;
			g.setColor(c);
			g.fillPolygon(poly);
		}
	}

	public static void show(Chromozome ch, String title) {
		JFrame frame = new JFrame();
		frame.setTitle(title);
		Container contentPane = frame.getContentPane();
		contentPane.add(new ShowChromozome(ch));
		frame.pack();
		frame.setVisible(true);
	}
}