package Cvika09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DogImpl implements Animal
{
    byte age;

    public DogImpl(byte age)
    {
        this.age = age;
    }

    @Override
    public void sound()
    {
        System.out.println("Bark");

    }

    @Override
    public String toString()
    {
        return "DogImpl age=" + age;
    }

    @Override
    public void toFile()
    {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Bark");
            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
