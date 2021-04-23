package Cvika09;

public abstract class AbstractAnimal // Abstractní třída pro zvířata, Byte pro věk a konstruktor pro zapsání té hodnoty
{
    byte age;

    public AbstractAnimal(byte age)
    {
        this.age = age;
    }

    public void sound() // Prázdná metoda kterou přepíšeme v jednotlivých třídách doplnující tuto třídu
    {

    }


}
