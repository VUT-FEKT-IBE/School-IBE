package Cvika2;
import java.util.Scanner;

public class DatabaseOperation
{

    public static void main(String[] args)
    {
        Database[] array = new Database[3];


        for(int i = 0; i < array.length; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Index: "+(i)+"\n"+"Zadejte jméno: ");
            String name = scanner.nextLine();

            System.out.print("Zadejte rok narození: ");
            int year = scanner.nextInt();

            array[i] = new Database(name, year);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte maximální uvazek: ");
        Database.SetMax(scanner.nextDouble());

        while(true)
        {
            System.out.print("Zadejte Index: ");
            int index = scanner.nextInt();

            if (index < array.length && index >=0)
            {
                System.out.println("Jméno: "+array[index].getName()+" Rok: "+array[index].getYear()+" Uvazek: "+array[index].getUvazek()+" ");
                System.out.print("Zadejte novou hodnotu uvazku: ");
                double tempUvazek = scanner.nextDouble();
                if (array[index].KontrolaUvazku(tempUvazek))
                {
                    System.out.println("Nový Uvazek je: "+array[index].getUvazek()+" ");
                }
                else
                    System.out.println("Uvazek se nezměnil");
            }
        }
    }
}
