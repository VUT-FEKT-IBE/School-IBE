package com.vutbr.feec.cviceni2;

public class Manager extends Employee{

	public Manager(String email, String name, int age, long salary, boolean gender) {
		super(email, name, age, salary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work()
	{
		System.out.print("jmeno: " + this.name);
		System.out.print(" email: " + this.email);
		System.out.print(" work as Manager");
		
	}
	
	public static long raiseSalary(long salary, long increse)
	{
		long help= salary;
		if ((salary+increse)<0) {
			System.out.print("\nnezle zmenit\n");
		}
		else
		{
			help= salary+increse;
		}
		return help;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	
}
