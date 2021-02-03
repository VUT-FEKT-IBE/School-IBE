package cz.vutbr.feec.zapocet;

public class App {

	public static void main(String[] args) {
		Bank b = new Bank("xstud00", 0123);
		Employe e = new Employe(1, "xxx", 56);
		b.addEmploye(e);
		b.removeEmploye(e);
		
		Customer c = new Customer(0, "a", "123");
		NormalAccount a = new NormalAccount(0, c);
		SavingsAccount a1 = new SavingsAccount(0, c);
		c.add(a);
		c.add(a1);
		c.printAccounts();
		b.createCustomer();
	}

}
