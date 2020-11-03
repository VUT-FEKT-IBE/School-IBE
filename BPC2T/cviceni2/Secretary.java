package com.vutbr.feec;

public class Secretary extends Employee{

	public Secretary(String email, String name, int age, long salary, boolean gender) {
		super(email, name, age, salary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work()
	{
		System.out.print("jmeno: " + this.name);
		System.out.print(" email: " + this.email);
		System.out.print(" work as Secretary");
		
	}
	
	public static void sendEmail(String from, String to, String content)
	{
		
		if (content.length() != 0)
		{
		
		System.out.print("from: " + from);
		System.out.print(" to: " + to);
		System.out.print(content);
		}
		else
		{
			System.out.print("Zapomeli jste napsat telo emailu");
		}
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
}
