package cz.vutbr.feec.zapocet;

public class Account {
	private double balance;
	private Customer owner;
	private String accountType;	
	

	public Account(double balance, Customer owner) {
		super();
		this.balance = balance;
		this.owner = owner;
	}
	
	public void print() {
		System.out.println("acount type: " + accountType + " balance: " + balance );
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	
	
}
