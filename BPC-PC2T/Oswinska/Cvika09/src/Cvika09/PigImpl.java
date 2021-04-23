package Cvika09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PigImpl implements Animal
{
    byte age;

    public PigImpl(byte age)
    {
        this.age = age;
    }

    @Override
    public void sound()
    {
        System.out.println("Oink");

    }

    @Override
    public String toString()
    {
        return "PigImpl age=" + age;
    }

    @Override
    public void toFile()
    {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Oink");
            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
