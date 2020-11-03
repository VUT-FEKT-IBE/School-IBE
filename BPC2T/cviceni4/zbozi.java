package com.vutbr.feec3;

public abstract class zbozi {
	private String nazev;
	private double cena;
	private static double DPH= 0.21;
	public zbozi(String nazev, double cena) {
		super();
		this.nazev = nazev;
		this.cena = cena;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public abstract String getJednotka();
}
