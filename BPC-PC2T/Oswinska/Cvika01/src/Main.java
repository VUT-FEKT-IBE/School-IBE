import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int inputInt, i;
        boolean prime = true;
        ArrayList<Integer> divisible = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        inputInt = scanner.nextInt();
        scanner.close();
        System.out.println("Your Number is: "+inputInt);

        for(i = 2; i <= inputInt / 2 ;i++)
        {
            if (inputInt % i == 0 )
            {
                prime = false;
                divisible.add(i);
            }
        }

        if (prime)
        {
            System.out.println(inputInt + " Is a Prime number.");
        }
        else
        {
            System.out.println(inputInt + " Is divisible by: " + divisible);
            System.out.println(inputInt + " Is not a prime number");
        }
    }
}
