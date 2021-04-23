package Cvika07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test
{

	public static int pouzeCelaCisla(Scanner sc)  // Metoda pro kontrolu jestli bylo zadano cele cislo
	{
		int cislo;
		try
		{
			cislo = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.print("zadejte prosim cele cislo: ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}

	public static float pouzeCelaneboDestinna(Scanner sc) // Metoda pro kontrolu jestli bylo zadano realne cislo
	{
		float cislo;
		try
		{
			cislo = sc.nextFloat();
		}
		catch(Exception e)
		{
			System.out.print("zadejte prosim realne cislo: ");
			sc.nextLine();
			cislo = pouzeCelaneboDestinna(sc);
		}
		return cislo;
	}


	public static void main(String[] args) { // Hlavni metoda
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();

		String name;
		int year;
		float gpa;

		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. vypis studentu");
			System.out.println("6 .. mazani studenta");
			System.out.println("10 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					mojeDatabaze=new Databaze(); // tvorba objektu databaze
					break;
				case 2:	// pridani studenta
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("Zadejte rok narozeni: ");
					year = pouzeCelaCisla(sc);
					gpa = 0;
					mojeDatabaze.setStudent(name,year,gpa);
					break;
				case 3: // zadani prumeru studenta
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("Zadejte prumer znamek studenta: ");
					gpa = pouzeCelaneboDestinna(sc);

					try
						{
							mojeDatabaze.setGPA(name, gpa);
						}
					catch (Exception e)
						{
							e.printStackTrace();
						}
					break;
				case 4: // print specifickeho studenta
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();

					try
					{
						System.out.println(mojeDatabaze.getStudent(name));
					}
					catch(Exception e)
					{
					System.out.println("Nebyl zadan prumer studenta");
					}
					break;
				case 5: // print vsech klicu HashMapy - vsech studentu
					mojeDatabaze.printStudentu();
					break;
				case 6: // mazani specifickeho studenta
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();
					mojeDatabaze.delStudent(name);
					break;
				case 10:
					run=false;
					break;
			}
		}
	}
}
