package Cvika04;

public class Vyjimky extends java.lang.Exception  // Konstruktor který doplňuje Exception class
{
    public Vyjimky() // Výjimka které nemá vstup
    {
        super("Nebyl zadan prumer"); // volá dědičný konstruktor
    }
    public Vyjimky(double prumer) // výjimka která má vstup díky kterému voláme tento konstruktor a vol
    {
        super("Prumer nebyl zadan v intervalu 1 az 5. Zadali jste: " + prumer);
    }
}
