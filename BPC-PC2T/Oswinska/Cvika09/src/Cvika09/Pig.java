package Cvika09;

public class Pig extends AbstractAnimal
{
    public Pig(byte age)
    {
        super (age);
    }

    @Override
    public void sound()
    {
        System.out.println("Oink");
    }
}
