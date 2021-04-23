package Cvika07;

public class Student
{
	public Student(int year, float gpa) // konstruktor pro zapsani dat
	{
		this.year=year;
		this.gpa=gpa;
	}
	public void writeGPA(float gpa) throws Vyjimky // zapis prumeru
	{
		if (gpa >= 1 && gpa <= 5)
			this.gpa=gpa;
		else
			throw new Vyjimky(gpa);
	}

	public int getYear() // getter pro rok narozeni
	{
		return this.year;
	}
	public float getGPA() throws Vyjimky // getter pro prumer s checkerem jestli byl zadan prumer
	{
		if (this.gpa == 0)
			throw new Vyjimky();
		else
			return this.gpa;
	}

	private int year; // privatni promenné
	private float gpa;
}