package cvika05;

public class Potravina extends Zboží // Třída potravina rozšiřující zboží
{
private int expirationDate;

public Potravina(String name, double price,int newExp) // Konstruktor Potravina díky ktérému zapíšeme expiraci
    {
    super(name,price); // reference na Zboží - Parenta, Implicitní reference a zapsání jména a ceny do Zboží
    this.expirationDate = newExp; // zapsání zadané expirační hodnoty
    }

    public int getExpirationDate() // Getter a Setter pro Expiraci
    {
        return expirationDate;
    }

    public void setExpirationDate(int newexpirationDate)
    {
        this.expirationDate = newexpirationDate;
    }

    @Override
    public String getJednotka() // Override Stringu Jednotka pro změnu hodnoty v třídě zboží kterou poté voláme v Testu
    {
        if(expirationDate == 1) // Jednoduchý if pro změnu výstupu, jestli jde o 1 den vrátí hodnota den a ne dnů dále i dny místo dnů - Kosmetická uprava - mimo zadání
            return "den";
        else if (expirationDate > 1 && expirationDate < 5)
            return "dny";
        else
            return "dnů";
    }
}
