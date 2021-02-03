package cz.vutbr.feec.zapocet;

public class Employe extends Person{

	private double salary;

	public Employe(long id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
