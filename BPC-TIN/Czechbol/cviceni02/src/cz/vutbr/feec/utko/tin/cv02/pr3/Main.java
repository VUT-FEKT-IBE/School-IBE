package cz.vutbr.feec.utko.tin.cv02.pr3;

public class Main {
	
	 public static final int NAHORU = 1;
	 public static final int DOLU = 2;
	 public static final int VLEVO = 3;
	 public static final int VPRAVO = 4;

	public static void main(String[] args) {
		
		
		HraciPole hraciPole = new HraciPole();
		
		hraciPole.vypisPole();
		hraciPole.posun(NAHORU);
		hraciPole.vypisPole();
		
		
	}

}