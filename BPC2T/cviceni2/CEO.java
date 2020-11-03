package com.vutbr.feec;

public class CEO extends Employee{

	public CEO(String email, String name, int age, long salary, boolean gender) {
		super(email, name, age, salary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work()
	{
		System.out.print("jmeno:" + this.name);
		System.out.print(" email: " + this.email);
		System.out.print(" work as CEO");
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
}
