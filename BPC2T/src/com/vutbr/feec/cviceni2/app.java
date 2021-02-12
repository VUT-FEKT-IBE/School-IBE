package com.vutbr.feec.cviceni2;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public Employee(String email, String name, int age, long salary, boolean gender)
		Employee em1 = new Secretary("havda@dkhdb.cz","Karolina Krasna", 18, 25000, true);
		Employee em2 = new Director("hda@dkhdb.cz","petra Krasna", 18, 25000, true);
		Employee em3 = new Manager("hsddasdssss@dkhdb.cz","zuzana Krasna", 18, 25000, true);
		Employee em4 = new CEO("ha@dkhdb.cz","baluga Krasna", 18, 25000, true);
		Employee em5 = new Programmer("vvvv@dkhdb.cz","nikdo", 18, 25000, true);
		
		Employee[] array = {em1, em2, em3, em4,em5};
		Secretary.sendEmail(em1.name, em3.name,"khdbkhsdbskdbdksdbdskbds\n");
		long newsalry= Manager.raiseSalary(em1.salary, 30000);
		em1.salary = newsalry;
		for (Employee employee : array) {
			employee.work();
			System.out.println(""); 
			
			}
		System.out.println(em1.salary); 
	}

}
