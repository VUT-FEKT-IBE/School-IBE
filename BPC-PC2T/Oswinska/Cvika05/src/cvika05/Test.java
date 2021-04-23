package cvika05;

public class Test
{
    public static void main(String[] args) // main celé funkce, tu začínáme
    {
        Zboží[] zboží = new Zboží[4]; // Array zboží

        zboží[0] = new Potravina("Rohlík",1.5, 1); // Deklarace hodnot arraye
        zboží[1] = new Nářadí("Kleště",278,24);
        zboží[2] = new Potravina("Chleba",20.8,6);
        zboží[3] = new Potravina("Jablko",51,20);


        for(int i = 0; zboží.length > i ;i++ ) // For který běží od 0 po velikost Arraye zboží - Future proofing pokud se změní velikost zboží
        {
            System.out.print(zboží[i].getName() + ", cena " + zboží[i].getPrice()); // První print který najde jméno a cenu ítého zboží

            if(zboží[i] instanceof Potravina ) // Jednoduché if else - které zjistí jestli array zboží má instanci Potravina pokud ano zapiš expiraci pokud má instanci Nářadí zapis záruku - mimo zadání ale chtěl jsem to udělat
            {
                Potravina expiration = (Potravina) zboží[i];
                System.out.println(", Trvanlivost " + expiration.getExpirationDate() + " " + expiration.getJednotka());
            }
            else
            {
                Nářadí warranty = (Nářadí) zboží[i];
                System.out.println(", Záruka " + warranty.getWarranty() + " " + warranty.getJednotka());
            }
        }
    }
}
