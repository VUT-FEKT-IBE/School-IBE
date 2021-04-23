import java.util.Scanner;

public class Pole
{
	private Scanner sc;
	private Hranol []mojeHranoly;

	// Konstruktor s velikosti pole
	public Pole(int velikost)
	{
		mojeHranoly=new Hranol[velikost];
		sc=new Scanner(System.in);
	}

	// vlozeni hranolu do pole na prvni volnou pozici
	void zadejHranol()
	{
		boolean drevena=false;
		float delka=0;
		float vyska=0;
		System.out.println("Zadejte delku podstavy hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		delka=sc.nextFloat();
		System.out.println("Zadejte vysku hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		vyska=sc.nextFloat();
		System.out.println("Je drevena?");
		while(!sc.hasNextBoolean()) // prepsano z nextfloat na next boolean 		6. chyba
		{
			sc.next();
		}
		drevena=sc.nextBoolean();
		if (Hranol.getPocetHranolu() == mojeHranoly.length) // prepsano < na ==  dalši chyba?	13. chyba
		{
			System.out.println("Pole uz je zaplneno");
			return;
		}
		mojeHranoly[Hranol.getPocetHranolu()] = new Hranol(delka,vyska,drevena); // prepsan zapis noveho hranolu 		10. chyba
	}
	
	// vypis objemu vsech hranolu
	void vypoctiObjem()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			System.out.println("Objem i. hranolu je" + mojeHranoly[i].vypoctiObjem()); // prepsano obsah na objem  		7.chyba
	}
	
	// vypis obsahu podstavy vsech hranolu
	void vypoctiObsahPodstavy()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			System.out.println("Obsah i. hranolu je" + mojeHranoly[i].vypoctiObsah()); // prepsano objem na obsash		8.chyba
	}
	
	// nalezeni indexu nejmensiho hranolu
	int najdiNejmensiObjem()
	{
		float min= Float.MAX_VALUE;
		int idx=0;										
		for (int i = 0;i < Hranol.getPocetHranolu() ; i++)
		{
			if (mojeHranoly[i].vypoctiObjem()<min){
				min=mojeHranoly[i].vypoctiObjem();
				idx=i;
			}
		}
		return idx;
	}
	
	// zjisteni celkoveho poctu drevenych kostek
	int zjistiPocetDrevenych(){
		int pocetDrevenych=0;
		for (int i = 0 ;i < Hranol.getPocetHranolu(); i++)		// prepsan for aby pocital pocet drevenych		9. chyba
		{
			if (mojeHranoly[i].zeDreva)  // prepsano z = true na == true  			12. chyba
				pocetDrevenych++;
		}
		return pocetDrevenych;
	}
}