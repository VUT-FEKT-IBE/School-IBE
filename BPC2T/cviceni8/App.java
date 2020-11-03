package com.vutbr.feec6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] n ={ 'a', 'b', 'c', 'd', 'e' };
			Employee e1= new Employee("e1", "sddssd", n);
			Employee e2= new Employee("e2", "sdd", n);
			Employee e3= new Employee("e3", "sddsdsdssdsdsdsdssd", n);
			Employee e4= new Employee("e4", "sddsqqqqqsd", n);
			Employee e5= new Employee("e5", "sddsfffffsd", n);
			Manager m1 = new Manager("m1", "s", n);
			Secretarian s1= new Secretarian("s1", "s", n);
			Secretarian s2= new Secretarian("s2", "ssss", n);
	
			m1.addEmploye(e1);
			m1.addEmploye(e2);
			m1.addEmploye(e3);
			m1.addEmploye(e4);
			m1.addEmploye(e5);
			m1.addRelation(s1);
			m1.vypis1();
			m1.vypis2();
			
			byte a = 5;
			
			Cat c = new Cat(a);
			Dog d = new Dog(a);
			Pig p = new Pig(a);
			Cow cw = new Cow(a);
			Goat g = new Goat(a);
			
			c.sound();
			d.sound();
			p.sound();
			cw.sound();
			g.sound();
			
			CatImpl ca = new CatImpl(a);
			DogImpl dog = new DogImpl(a);
			PigImpl pi = new PigImpl(a);
			GoatImpl go = new GoatImpl(a);
			CowImpl cow = new CowImpl(a);
			ca.save();
			ca.sound();
			dog.save();
			dog.sound();
			pi.save();
			pi.sound();
			go.save();
			go.sound();
			cow.save();
			cow.sound();
			
			
			
	}

}
