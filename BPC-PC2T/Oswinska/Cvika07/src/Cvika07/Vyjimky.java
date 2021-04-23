package Cvika07;

public class Vyjimky extends java.lang.Exception
{
    public Vyjimky() // vyjimka nebyl zadan GPA
    {
        super("Nebyl zadan prumer");
    }
    public Vyjimky(float prumer) // Vyjimky GPA mimo interval
    {
        super("Prumer nebyl zadan v intervalu 1 az 5. Zadali jste: " + prumer);
    }
}
