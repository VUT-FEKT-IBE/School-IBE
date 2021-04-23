package Cvika09;

public class Cow extends AbstractAnimal
{
    public Cow(byte age)
    {
        super (age);
    }

    @Override
    public void sound()
    {
        System.out.println("Moo");
    }
}
