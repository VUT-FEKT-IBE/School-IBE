package cz.vutbr.feec.utko.tin.cv1;

public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Auto(100, "Skoda");
		
		Auto auto2 = new Auto(300, "BMW");
		
		Auto auto3 = new Auto(400, "Audi");
		
		Auto auto4 = new Auto(800, "Jaguar");
		
		Mapa mapa = new Mapa();
		mapa.setAuto1(auto1);
		mapa.setAuto2(auto2);
		mapa.setAuto3(auto3);
		mapa.setAuto4(auto4);
		
		mapa.vypisVsechnaAuta();
	}

}