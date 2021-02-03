package cz.vutbr.feec.cviko11;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Fitness {

	public Fitness(String path) throws IOException {
		template = ImageIO.read(new File(path));
	}

	final static int width = 256;
	final static int height = 256;

	private BufferedImage template;
	private BufferedImage image = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_ARGB);

	public int getFitness(Chromozome ch) {
		// vykresli chromozom do platna
		Graphics2D platno = (Graphics2D) image.getGraphics();
		ShowChromozome.drawGraphics(platno, ch);

		int error = 0;
		// pro vsechny pixely
		for (int y = 0; y < width; y++) {
			for (int x = 0; x < width; x++) {
				// chromozom
				int c = image.getRGB(x, y);
				Color clrChromozom = new Color(c);

				// predloha
				int c2 = template.getRGB(x, y);
				Color clrObrazek = new Color(c2);
				
				// chyba
				error += clrChromozom.getRed() - clrObrazek.getRed();
				error += clrChromozom.getGreen() - clrObrazek.getGreen();
				error += clrChromozom.getBlue() - clrObrazek.getBlue();
			}
		}
		return error;
	}

}
