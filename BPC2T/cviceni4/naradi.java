package com.vutbr.feec3;

public class naradi extends zbozi {
	private int zaruka;

	public naradi(String nazev, double cena, int zaruka) {
		super(nazev, cena);
		this.setZaruka(zaruka);
	}

	@Override
	public String getJednotka() {
		// TODO Auto-generated method stub
		return "mesicu";
	}

	public int getZaruka() {
		return zaruka;
	}

	public void setZaruka(int zaruka) {
		this.zaruka = zaruka;
	}

}
