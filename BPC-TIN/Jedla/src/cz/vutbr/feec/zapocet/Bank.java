package cz.vutbr.feec.zapocet;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	private String Name;
	private int codeOfBank;
	private HashMap<Employe, Integer> employe = new HashMap<Employe, Integer>();
	private HashMap<Customer, Integer> customers = new HashMap<Customer, Integer>();
	public Bank(String name, int codeOfBank) {
		super();
		Name = name;
		this.codeOfBank = codeOfBank;
	}

	
	public void addEmploye(Employe emp) {
		employe.put(emp, (int) emp.getId());
	}
	
	public void removeEmploye(Employe emp) {
		employe.remove(emp, (int) emp.getId());
	}
	
	public void addCustomer(Customer cu) {
		customers.put(cu, (int) cu.getId());
	}
	
	public void removeCustomer(Customer cu) {
		customers.put(cu, (int) cu.getId());
	}
	public void createCustomer() {
		System.out.println("Id");
		long id = sc.nextInt();
		System.out.println("name");
		String name = sc.next();
		System.out.println("personal ID");
		String personalId = sc.next();
		
		Customer customer = new Customer(id, name, personalId);
		this.addCustomer(customer);
	}
	public void addAcount(Customer cu) {
		System.out.println("type acount 1 for Normal 2 for savings");
		int type = sc.nextInt();
		if(type == 1) {
			NormalAccount a = new NormalAccount(0, cu);
			cu.add(a);
		}
		else if( type ==2) {
			SavingsAccount a = new SavingsAccount(0, cu);
			cu.add(a);
		}
		else {
			System.out.println("something goes wrong");
		}
	}
	public void removeAccount(Customer cu) {
		System.out.println("id of acount");
		int id = sc.nextInt();
		cu.removeAcc(id);
		
	}
	public void newInterestRate(double number) {
		
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCodeOfBank() {
		return codeOfBank;
	}

	public void setCodeOfBank(int codeOfBank) {
		this.codeOfBank = codeOfBank;
	}

}
