package cz.vutbr.feec.utko.tin.cv1;

public class Auto {
	private int cena;
	private String znacka;

	@Override
	public String toString() {
		return "Auto [cena=" + cena + ", znacka=" + znacka + "]";
	}

	public Auto(int cena) {
		super();
		this.cena = cena;
	}

	public Auto(String znacka) {
		super();
		this.znacka = znacka;
	}

	public Auto(int cena, String znacka) {
		super();
		this.cena = cena;
		this.znacka = znacka;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getZnacka() {
		return znacka;
	}

	public void setZnacka(String znacka) {
		this.znacka = znacka;
	}

}
