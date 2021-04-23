package Cvika09;

public class App
{
    /**
     * Interface neimplementuje žádné metody pouze jejich názvy definuje a každá třídá která implementuje interface musí mít tyto metody.
     *
     *
     * Abstractní třída je jako obyčejná třída kde můžeme mít metody ale nevytváříme z ní objekt pouze skrz ní pomáháme tvořit objekty se stejnými parametry
     * např Abstract Osoba kde definujeme co je Osoba - jméno, příjmení věk
     * dále vytvoříme třídu Student která extends Osoba - tak tvoříme objekt student který má parametry Osoby a dále své dané parametry - např známky
     *
     *
     * enum využíváme tam kde jsou už natvrdo dané hodnoty - např v Databázi o Studentech a Učitelích  bude enum s hodnotami  Student Učitel
     * Kdyby jsme to řešili skrze String bylo by možné zadat jiné chybné Stringy - které musíme ošetřit atd.
     * @author xtoman41
     */


    public static void main(String [] args) // Main se tvorbou objektů a zápisem hodnot
    {
        char[] p = {'a','b','c','d'};

        Employee e1 = new Employee("Emp1","Emp1@mail.com",p);
        Employee e2 = new Employee("Emp2","Emp2@mail.com",p);
        Employee e3 = new Employee("Emp3","Emp3@mail.com",p);
        Employee e4 = new Employee("Emp4","Emp4@mail.com",p);
        Employee e5 = new Employee("Emp5","Emp5@mail.com",p);
        Manager m1 = new Manager("Man1","Man1@email.com",p);
        Secretarian s1 = new Secretarian("Sec1","Sec1@email.com",p);
        Secretarian s2 = new Secretarian("Sec2","Sec2@email.com",p);

        m1.addRelation(s2);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m1.addEmployee(e3);
        m1.addEmployee(e4);
        m1.addEmployee(e5);

        m1.listEmployees();
        m1.listRelation();

        byte age = 4;

        Cat c = new Cat(age); // Popsány jsou pouze kočky v každé variantě - je to všude stejné
        Dog d = new Dog(age);
        Pig i = new Pig(age);
        Cow w = new Cow(age);
        Goat g = new Goat(age);

        c.sound();
        d.sound();
        i.sound();
        w.sound();
        g.sound();

        CatImpl cat = new CatImpl(age);
        DogImpl dog = new DogImpl(age);
        PigImpl pig = new PigImpl(age);
        CowImpl cow = new CowImpl(age);
        GoatImpl goat = new GoatImpl(age);

        cat.sound();
        cat.toFile();
        dog.sound();
        dog.toFile();
        pig.sound();
        dog.toFile();
        cow.sound();
        cow.toFile();
        goat.sound();
        goat.toFile();


    }

}
