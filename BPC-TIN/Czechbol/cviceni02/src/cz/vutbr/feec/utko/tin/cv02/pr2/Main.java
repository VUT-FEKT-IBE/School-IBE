package cz.vutbr.feec.utko.tin.cv02.pr2;

public class Main {

	public static void main(String[] args) {
		Adresar adresar1 = new Adresar("Adr 1");
		Adresar adresar2 = new Adresar("Adr 2");
		Adresar adresar3 = new Adresar("Adr 3");
		Adresar adresar4 = new Adresar("Adr 4");
		Adresar adresar5 = new Adresar("Adr 5");
		Adresar adresar6 = new Adresar("Adr 6");
		
		adresar1.pridejAdresar(adresar2);
		adresar1.pridejAdresar(adresar4);
		adresar1.pridejAdresar(adresar5);
		adresar1.pridejAdresar(adresar6);
		
		adresar2.pridejAdresar(adresar1);
		adresar2.pridejAdresar(adresar3);
		adresar2.pridejAdresar(adresar5);
		
		adresar5.pridejAdresar(adresar4);
		
		System.out.println("Sousede Adresare 1");
		adresar1.vypisSousedy();
		System.out.println();
		System.out.println("Sousede Adresare 2");
		adresar2.vypisSousedy();
		System.out.println();
		System.out.println("Sousede Adresare 3");
		adresar3.vypisSousedy();
		System.out.println();
		System.out.println("Sousede Adresare 4");
		adresar4.vypisSousedy();
		System.out.println();
		System.out.println("Sousede Adresare 5");
		adresar5.vypisSousedy();
		System.out.println();
		System.out.println("Sousede Adresare 6");
		adresar6.vypisSousedy();
	}

}
