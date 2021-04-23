package Cvika09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GoatImpl implements Animal
{
    byte age;

    public GoatImpl(byte age)
    {
        this.age = age;
    }

    @Override
    public void sound()
    {
        System.out.println("Mee");

    }

    @Override
    public String toString()
    {
        return "GoatImpl age=" + age;
    }

    @Override
    public void toFile()
    {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Mee");
            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
