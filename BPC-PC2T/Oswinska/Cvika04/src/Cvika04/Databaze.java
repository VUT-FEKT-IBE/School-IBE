package Cvika04;

import java.util.Scanner;

public class Databaze {
	public Databaze(int pocetPrvku) // Databázový Array
	{
		prvkyDatabaze=new Student[pocetPrvku]; // Tvorba databáze o velikosti kterou zadá uživatel při volbě 1
		sc=new Scanner(System.in);
	}
	
	public void setStudent() // Setter pro zadání jména a roku studentu
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=Test.pouzeCelaCisla(sc);
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
	
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
}
