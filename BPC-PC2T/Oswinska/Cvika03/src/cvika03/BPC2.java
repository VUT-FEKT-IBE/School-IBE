package cvika03;

public class BPC2 implements Předmět
{
    public static final String name = "BPC2"; // proměnné
    private int body;
    private static int projekt;
    private static int půlzkouška;
    private static int zkouška;
    private boolean zápočet;

    private static final int maxProjekt = 30; // Znovu maximální hodnoty na které nešaháme
    private static final int maxPůlZkouška = 20;
    private static final int maxZkouška = 50;

    @Override
    public String DisplayName() // Override pro returny do Test.java
    {
        return name;
    }
    @Override
    public double DisplayPoints()
    {
        body = projekt + půlzkouška + zkouška;
        return body;
    }
    @Override
    public String DisplayPass()
    {
        testZápočet();
        if (zápočet)
            return "Zápočet udělen";
        else
            return "Zápočet neudělen";
    }

    public static void setProjekt(int Projekt) // Settery pro body do projektu a zkoušek
    {
        if (Projekt <= maxProjekt || Projekt < 0)
            projekt = Projekt;
        else System.out.println("Body zadané mimo interval");
    }
    public static void setPůlZkouška(int PůlZkouška)
    {
        if (PůlZkouška <= maxPůlZkouška || PůlZkouška < 0)
            půlzkouška = PůlZkouška;
        else System.out.println("Body zadané mimo interval");
    }
    public static void setZkouška(int Zkouška)
    {
        if (Zkouška <= maxZkouška || Zkouška < 0)
            zkouška = Zkouška;
        else System.out.println("Body zadané mimo interval");
    }
    public void testZápočet() // modifikovaný tester pro BPC2
    {
        body = projekt + půlzkouška + zkouška;
        if (body >= Předmět.minZapocet)
            zápočet = true;
        else zápočet = false;
    }

}
