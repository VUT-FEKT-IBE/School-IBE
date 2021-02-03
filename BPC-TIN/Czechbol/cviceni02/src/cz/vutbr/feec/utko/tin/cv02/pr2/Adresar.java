package cz.vutbr.feec.utko.tin.cv02.pr2;

import java.util.Vector;

public class Adresar {
	private String nazev;
	private Vector<Adresar> sousede = new Vector<>();
	
	public Adresar(String nazev) {
		super();
		this.nazev = nazev;
	}

	public void pridejAdresar(Adresar pridavanyAdresar) {
		sousede.add(pridavanyAdresar);
	
	}
	
	public int pocetSousedu() {
		return sousede.size();
	
	}
	
	public void vypisSousedy() {
		
		for (Adresar adresar : sousede) {
			System.out.println(adresar.toString());
		}
	
	}
	
	@Override
	public String toString() {
		return "Adresar ( " + nazev + ")";
	}
}
