package cvika03;

public class BPC1 implements Předmět
{
    private static final String name = "BPC1"; // proměnné se kterými budeme pracovat v této třídě
    private double body;
    private static int aktivita;
    private static int zkouška;
    private boolean zápočet;

    private static final int maxAktivita = 20; // Max hodnoty
    private static final int maxZkouška = 80;

    @Override
    public String DisplayName() // Předání jména, dále bodů a nakonec zápočtu Předmětu který nám je předá do Test.java
    {
    return name;
    }
    @Override
    public double DisplayPoints()
    {
    body = aktivita + zkouška;
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

    public static void setAktivita(int Aktivita) // Settery pro Aktivitu a zkoušku
    {
        if (Aktivita <= maxAktivita || Aktivita < 0)
            aktivita = Aktivita;
        else System.out.println("Body zadané mimo interval");
    }
    public static void setZkouška(int Zkouška)
    {
        if (Zkouška <= maxZkouška || Zkouška < 0)
            zkouška = Zkouška;
        else System.out.println("Body zadané mimo interval");
    }
    public void testZápočet() // Tester pro zápočet který zapíše body a změní zápočet na true nebo false
    {
        body = aktivita + zkouška;
        if (body >= Předmět.minZapocet)
            zápočet = true;
        else zápočet = false;
    }


}
