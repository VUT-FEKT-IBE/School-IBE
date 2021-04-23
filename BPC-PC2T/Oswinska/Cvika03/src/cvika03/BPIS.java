package cvika03;

public class BPIS implements Předmět
{
    public static final String name = "BPIS"; // proměnná se jménem
    private static int body;
    private static boolean zápočet;

    @Override
    public String DisplayName() // Override pro print v Test.java
    {
        return name;
    }
    @Override
    public double DisplayPoints()
    {
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

    public static void setZápočet(String Zápočet) // Setter pro zápočet který dá 100 nebo 0 bodů ve stylu VUT IS
    {
        if (Zápočet.equals("ano"))
            body = 100;
        else if (Zápočet.equals("ne"))
            body = 0;
        else System.out.println("špatně zadaný vstup");
    }

    public static void testZápočet() // Tester modifikovaný pro BPIS
    {
        if (body >= Předmět.minZapocet)
            zápočet = true;
        else zápočet = false;
    }


}
