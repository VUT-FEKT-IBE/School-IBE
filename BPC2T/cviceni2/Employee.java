package com.vutbr.feec;

public abstract class Employee implements CompanyRules {

	protected String email;
	protected String name;
	protected int age;
	protected long salary;
	protected boolean gender;
	
	public Employee(String email, String name, int age, long salary, boolean gender)
	{
		this.email= email;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender= gender;
	}
	
	public abstract void work();
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
