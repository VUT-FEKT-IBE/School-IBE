package cvika03;

public interface Předmět  // Zavední interface, konstanty minZápočet a metod pro ukázání jména předmětu, Počtu bodů a jestli jsme dostali zápočet
{

    final int minZapocet = 15;

    public String DisplayName();
    public double DisplayPoints();
    public String DisplayPass();

}
