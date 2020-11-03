package com.vutbr.feec3;

public class potravina extends zbozi {

	private int trvanlivost;

	public potravina(String nazev, double cena, int trvanlivost) {
		super(nazev, cena);
		this.trvanlivost = trvanlivost;
	}

	@Override
	public String getJednotka() {
		// TODO Auto-generated method stub
		return "dnu";
	}

	public int getTrvanlivost() {
		return trvanlivost;
	}

	public void setTrvanlivost(int trvanlivost) {
		this.trvanlivost = trvanlivost;
	}

}
