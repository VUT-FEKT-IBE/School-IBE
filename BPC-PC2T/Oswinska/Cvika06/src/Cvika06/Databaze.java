package Cvika06;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Databaze {
	public Databaze(int pocetPrvku) // Databázový Array
	{
		prvkyDatabaze=new Student[pocetPrvku]; // Tvorba databáze o velikosti kterou zadá uživatel při volbě 1
		sc=new Scanner(System.in);
	}
	
	public void setStudent(String jmeno,int rok) // Setter pro zadání jména a roku studentu
	{
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	public Student getStudent(int idx) // Getter pro prvky databáze, využito s kontrole velikosti arraye
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws Vyjimky // setter pro průměr u kterého jsme přidali throws Vyjimky aby jsme Exception předali vyšší třídě a postarali se o to tam
	{
			prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}

	public void printDatabase() throws Vyjimky // Metoda pro tisk cele databaze
	{
		for(int i=0; prvkyDatabaze.length > i; i++)
		{
			System.out.println("Jmeno: "+ prvkyDatabaze[i].getJmeno() + ", " + "rok narozeni: "+ prvkyDatabaze[i].getRocnik() + ", " + "studijni prumer: " + prvkyDatabaze[i].getStudijniPrumer());
		}
	}

	public void saveToFile(String soubor) throws Vyjimky  // metoda pro ulozeni do souboru
	{
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(soubor, true))) // try s deklarovanym bufferovanym zapisovacem
		{
		int i = 0;
		while(prvkyDatabaze.length > i) // dokud je pocet prvku větši než i zapisuj
		{
			bw.append(prvkyDatabaze[i].getJmeno()+ " " + prvkyDatabaze[i].getRocnik() + " "  + prvkyDatabaze[i].getStudijniPrumer() + "\n"); // zapis hodnot oddelen mezerami
			i++;
		}
		}
		catch (IOException e)
		{
			System.out.println("Vyjimka typu: " + e.toString());
		}
	}

	public void loadFromFile(String soubor, Databaze mojeDatabaze) throws Vyjimky // metoda pro nacet hodnot
	{
		String name;
		int year;
		float avrg;
		try (Scanner load = new Scanner(new FileReader(soubor))) // deklarovany scanner pro cteni ze souboru
		{
			int i = 0;
			while(load.hasNext()) // dokud je dalsi scannovatelna vec s souboru pokracuj
			{
				name = load.next(); // scannery pro kazdou potrebnou promenou v souboru s databazi
				year = load.nextInt();
				avrg = load.nextFloat();


				mojeDatabaze.setStudent(name,year); // zapis do databaze
				mojeDatabaze.setPrumer(i,avrg);
				i++;
			}
		}
		catch (IOException e)
		{
			System.out.println("Vyjimka typu: " + e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Nebyl inicializovan array nebo pocet studentu je vetsi nez array");
		}
	}

	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
}
