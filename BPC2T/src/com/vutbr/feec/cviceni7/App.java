package com.vutbr.feec.cviceni7;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		Student s1 = new Student(1, "jeljdn@dsds.cz", "a", today);
		Student s2 = new Student(2, "jen@dsds.cz", "b", today);
		Student s3 = new Student(3, "jsdsdsdsdssd@dsds.cz", "c", today);
		Student s4 = new Student(4, "sdsaassd@dsds.cz", "d", today);
		Student s5 = new Student(5, "qwqwwqqw@dsds.cz", "e", today);
		Database d1 = new Database();
		d1.database.add(s1);
		
		d1.database.add(s2);
		
		d1.database.add(s3);
		
		d1.database.add(s4);
	
		d1.database.add(s5);
		d1.vypis();
		if(d1.erase("qwqwwqqw@dsds.cz")==true)
		{
		d1.vypis();
		}
	}

}
