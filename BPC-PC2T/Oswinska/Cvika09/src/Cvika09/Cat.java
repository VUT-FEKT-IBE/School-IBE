package Cvika09;

public class Cat extends AbstractAnimal // Kočka Implementující Abstract Animal
{
    public Cat(byte age) // Konstruktor se zápisem věku
    {
        super (age);
    }

    @Override
    public void sound() // přepis zvuku
    {
        System.out.println("Meow");
    }
}
