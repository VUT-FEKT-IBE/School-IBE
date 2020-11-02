package cz.vutbr.feec.utko.tin.cv02.pr1;

import java.util.Vector;

public class Mapa {
	private Vector<Auto> autaNaMape = new Vector<>();
	
	public void pridejAuto(Auto pridavaneAuto) {
		autaNaMape.add(pridavaneAuto);
	}
	
	public int pocetAut() {
		return autaNaMape.size();
	}
	
	public boolean odebratAuto(Auto odebiraneAuto) {
		return autaNaMape.remove(odebiraneAuto);
	}
	
	public void vypisAuta() {
		for (Auto auto : autaNaMape) {
			System.out.println(auto);
		}
	}
}