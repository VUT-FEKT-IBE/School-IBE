package Cvika07;

import java.util.*;

public class Databaze
{
	public Databaze() // tvorba objektu Hashmapy
	{
		database = new HashMap<>();
	}
	
	public void setStudent(String name, int year, float gpa) // zapis studenta do Hashmapy a tvorba objektu studenta
	{
		database.put(name, new Student(year, gpa));
	}

	public Boolean setGPA(String name, float gpa) throws Vyjimky // zapis prumeru do objektu student s klíčem databáze
	{
		if (database.containsKey(name)) {
			database.get(name).writeGPA(gpa);
			return true;
		} else {
			System.out.print("Student neexistuje");
			return false;
		}
	}

	public Boolean getStudent(String name) throws Vyjimky // get student ktery najde jestli student existuje a pokud ano vypise studenta
	{
		if (database.containsKey(name)) {
			System.out.println("Jmeno: " + name + " Rok narozeni: " + database.get(name).getYear() + " Prumer: " + database.get(name).getGPA());
			return true;
		} else {
			System.out.println("Student neexistuje");
			return false;
		}
	}

	public void printStudentu() // print vsech studentu
	{
		System.out.println(database.keySet());
	}

	public void delStudent(String name) // mazani studenta podle jmena
	{
		database.remove(name);
	}

	private Map<String, Student> database; // deklarace Mapy s klicem a objektem student
}