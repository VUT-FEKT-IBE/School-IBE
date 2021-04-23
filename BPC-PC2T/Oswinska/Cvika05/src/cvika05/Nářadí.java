package cvika05;

public class Nářadí extends Zboží // Třída nářadí rozšiřující Zboží, v podstatě uplně to samé jak Potravina akorát místo expirace řešíme Záruku
{
    private int warranty;

    public Nářadí(String name, double price,int newWarr) // Konstruktor pro zapsání záruky
    {
        super(name,price); // Znovu super pro referenci na Zboží a zapsání jména a ceny
        this.warranty = newWarr; // Zapsání expirační hodnoty
    }

    public int getWarranty() // Getter a Setter pro Expiraci
    {
        return warranty;
    }

    public void setWarranty(int newWarr)
    {
        this.warranty = newWarr;
    }

    @Override
    public String getJednotka() // Override na String jednotky s Ifem pro zjištění jestli jde o měsíc , x měsice nebo x měsíců - mimo zadání ale je to pro mne bonus
    {
        if (warranty == 1)
            return "měsíc";
        else if (warranty > 1 && warranty < 5)
            return "měsíce";
        else
            return "měsíců";
    }
}
