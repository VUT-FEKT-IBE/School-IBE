package cz.vutbr.feec.zapocet;

import java.util.ArrayList;

public class Customer extends Person {

	private String personalID;
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public Customer(long id, String name, String personalID) {
		super(id, name);
		this.personalID = personalID;
	}

	public void printAccounts() {
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).print();
		}
	}

	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

	public void add(Account a) {
		accounts.add(a);
	}

	public void removeAcc(int id) {
		accounts.remove(id);
	}

}
