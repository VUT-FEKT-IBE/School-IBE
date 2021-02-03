package cz.vutbr.feec.utko.tin.cv02.pr1;

public class Auto {
	private String nazev;
	private int cena;
	private int x,y;
	
	public Auto(String nazev, int cena, int x, int y) {
		this.nazev = nazev;
		this.cena = cena;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Auto ( " + nazev + ", " + cena + " Kè, [" + x + ";" + y + "] )";
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}


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
