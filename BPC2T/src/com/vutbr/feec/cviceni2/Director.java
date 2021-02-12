package com.vutbr.feec.cviceni2;

public class Director extends Employee{
	public Director(String email, String name, int age, long salary, boolean gender) {
		super(email, name, age, salary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work()
	{
		System.out.print("jmeno: " + this.name);
		System.out.print(" email: " + this.email);
		System.out.print(" work as Director");
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	public final void removeCompany() {
	}
}
