package cvika03;

import java.util.Scanner;

public class Test
{

    public static void main(String[] args)
    {
     int index;
     System.out.println(" 0. Opuštění programu\n 1. BPC1 \n 2. BPC2 \n 3. BPIS \n 4. Print výsledků a konec programu"); // Print nabídky hlavního menu

     Scanner scanner  = new Scanner(System.in);

    boolean menu = true; // Boolean který nám drží hlavní menu v loopu do ukončení uživatelem
     while(menu)
     {
         System.out.print("Zadejte index předmětu: ");
         index = scanner.nextInt();

         switch(index)
         {
             case 0: // Okamžité ukončení
             {
                menu = false;
                break;
             }
             case 1: // Zapsání hodnot do BPC1
             {
              Předmět hodnoty = new BPC1(); // Komunikace s objektem
              System.out.println("\n" + hodnoty.DisplayName()); // zavolání ukázání jména skrz Předmět do BPC1.Java


              System.out.print("Zadejte body za aktivitu na cvičení: ");
              BPC1.setAktivita(scanner.nextInt());

              System.out.print("Zadejte body za zkoušku: ");
              BPC1.setZkouška(scanner.nextInt());

              System.out.println("Dosažené body: "+ hodnoty.DisplayPoints() + "\n" + hodnoty.DisplayPass()); // Nepotřebný print který ukazuje dosažené body a jestli máme zápočet - Irelevantní pokud použíjeme 4 v main menu
              break;
             }
             case 2: // Zápis hodnot pro BPC2
             {
                 Předmět hodnoty = new BPC2();
                 System.out.println("\n" + hodnoty.DisplayName());


                 System.out.print("Zadejte body za Projekt: ");
                 BPC2.setProjekt(scanner.nextInt());

                 System.out.print("Zadejte body za Půlsemestrální zkoušku: ");
                 BPC2.setPůlZkouška(scanner.nextInt());

                 System.out.print("Zadejte body za zkoušku: ");
                 BPC2.setZkouška(scanner.nextInt());

                 System.out.println("Dosažené body: "+ hodnoty.DisplayPoints() + "\n" + hodnoty.DisplayPass()); // Znovu nepotřebný print pokud použijeme 4
                 break;
             }
             case 3: // Zápis ano / ne do udělení zápočtu
             {
                 Předmět hodnoty = new BPIS();
                 System.out.println("\n" + hodnoty.DisplayName());

                 System.out.print("Udělit zápočet? ");
                 scanner.nextLine(); // Prázdný scanner pro eliminaci \n
                 BPIS.setZápočet(scanner.nextLine()); // scanner pro ano || ne

                 System.out.println(hodnoty.DisplayPass());
                 break;
             }
             case 4: // Print všech předmětů - Jejich bodů a zápočtu
             {
                 Předmět print1 = new BPC1();
                 System.out.println(print1.DisplayName());
                 System.out.println("Dosažené body: "+ print1.DisplayPoints() + "\n" + print1.DisplayPass());

                 Předmět print2 = new BPC2();
                 System.out.println(print2.DisplayName());
                 System.out.println("Dosažené body: "+ print2.DisplayPoints() + "\n" + print2.DisplayPass());

                 Předmět print3 = new BPIS();
                 System.out.println(print3.DisplayName());
                 System.out.println(print3.DisplayPass());
                 menu = false;
                 break;
             }
             default: // Menší opatření když uživatel zadá špatný index aby se program neukončil
                 menu = true;
         }
     }
        scanner.close(); // Zavření scanneru protože nechceme aby garbage collector dělal vše za nás, příprava na python
    }
}
