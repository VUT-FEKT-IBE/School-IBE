package GrEditor;


public class Main {

	public static void main(String[] args) {
		Platno p = new Platno(500, 500);
		
		Kruh k = new Kruh(250, 250, 50);
		
		p.pridej(k);
		
		Obdelnik o = new Obdelnik(25, 64, 30, 50);
		
		p.pridej(o);
		
		p.vytvorRastr();
		System.out.println("Hotovo");
		
	}

}
