package Cvika04;

import java.util.Scanner;

public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}

	public static float pouzeCelaneboDestinna(Scanner sc) // Try catch pro kontrolu celych cisel a desetinných
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();
		}
		catch() // Catch pro všechny exceptiony
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele nebo desetinne cislo ");
			sc.nextLine();
			cislo = pouzeCelaneboDestinna(sc);
		}
		return cislo;
	}
	public static int arraySize(Scanner sc, Databaze mojeDatabaze) // try catch pro délku arraye se studenty
	{
		int cislo = 0;
		try {
			cislo = sc.nextInt();
			mojeDatabaze.getStudent(cislo);
		}
		catch(ArrayIndexOutOfBoundsException e) //Catch pro index větší než max array
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim index v rozsahu 0 až max student");
			sc.nextLine();
			cislo = arraySize(sc,mojeDatabaze); // Rekurze pro scan inputu a zpětné kontroly - stejné jak u všech try catchů v této části kódu
		}
		catch(NullPointerException e) // Exception pro pointer který nikam nevede, Array sice ten Index zná ale nejsou tam žádná data
		{
			System.out.println("Nastala vyjimka typu " + e.toString());
			System.out.println("zadejte prosim index v rozsahu 0 až max indexovaný student");
			sc.nextLine();
			cislo = arraySize(sc,mojeDatabaze);
		}
		return cislo;
	}
	public static float helpPrumer(Scanner sc, Databaze mojeDatabaze) // Try catch pro prumer
	{
		int cislo = 0;
		float prum = 0;
		try {
			cislo = arraySize(sc, mojeDatabaze);
			prum = pouzeCelaneboDestinna(sc) ;
			mojeDatabaze.setPrumer(cislo, prum);
		}
		catch(Exception e) // zachycení všech exceptionů a rekurzivní scan a kontrola dokud uživatel nezadá vhodný vstup
		{
			System.out.println("Nastala vyjimka typu " + e.toString());
			sc.nextLine();
			prum = helpPrumer(sc, mojeDatabaze);

		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(0);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(pouzeCelaCisla(sc));
					break;
				case 2:
					mojeDatabaze.setStudent();
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					helpPrumer(sc, mojeDatabaze);
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=arraySize(sc, mojeDatabaze);
					Student info=mojeDatabaze.getStudent(idx);
					try { // Try Catch pro print
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					} catch (Vyjimky vyjimky) { // Vyjimka nezadání prumeru
						System.out.println("Nastala vyjimka typu " + vyjimky.toString());
					}
					catch (NullPointerException e) // Vyjimka při zadání printu studenta jehož ID existuje ale ne data
					{
						System.out.println("Chyba typu: "+e);
						System.out.println("Student není indexován přidejte studenta: ");
					}
					break;
				case 5:
					run=false;
					break;
			}
		}
	}
}
