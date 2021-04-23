package cvika05;

public abstract class Zboží // Abstraktní třída díky které "doplnujeme" metody pro child třídy
{
    private String name;
    private double price;
    private final double DPH = 1.21; // DPH zadáno jako 121% pro rychle zapsání hodnoty v getPrice - Nemusíme zbytečně dělat další operace.

    public Zboží (String newName,double newPrice) // Konstruktor kterým zapíšeme hodnoty
    {
        this.name = newName;
        this.price = newPrice;
    }

    public String getName() // Standartní Gettery a settery
    {
        return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public double getPrice()
    {
        return price * DPH;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public abstract String getJednotka(); // Abstrakní string který @Overridujeme aby jsme do něj mohli zapsat z child tříd
}
