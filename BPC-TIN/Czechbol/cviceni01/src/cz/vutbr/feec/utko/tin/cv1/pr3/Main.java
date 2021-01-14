package cz.vutbr.feec.utko.tin.cv1.pr3;

public class Main {

	public static void main(String[] args) {
		Paket paket1 = new Paket();
		Paket paket2 = new Paket();
		Paket paket3 = new Paket();
		Paket paket4 = new Paket();
		
		paket1.setDalsiPaket(paket2);
		paket2.setDalsiPaket(paket3);
		paket3.setDalsiPaket(paket4);
		paket4.setDalsiPaket(paket1);

	}

}
