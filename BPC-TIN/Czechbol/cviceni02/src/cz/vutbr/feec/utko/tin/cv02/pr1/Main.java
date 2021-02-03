package cz.vutbr.feec.utko.tin.cv02.pr1;

public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Auto("BMW", 500, 0, 10);
		Auto auto2 = new Auto("Skoda", 200, 100, 5);
		Auto auto3 = new Auto("Audi", 800, 10, 10);
		Auto auto4 = new Auto("Ford", 400, -15, 425);
		
		Mapa mapa = new Mapa();
		
		System.out.println(mapa.pocetAut());
		
		mapa.pridejAuto(auto1);
		mapa.pridejAuto(auto2);
		
		System.out.println(mapa.pocetAut());
		System.out.println(mapa.odebratAuto(auto1));
		System.out.println(mapa.pocetAut());
		System.out.println(mapa.odebratAuto(auto4));
		
		mapa.pridejAuto(auto1);
		mapa.pridejAuto(auto3);
		mapa.pridejAuto(auto4);
		
		mapa.vypisAuta();
		
		
		
		
		
	}

}
