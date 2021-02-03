package cz.vutbr.feec.zapocet;

public class SavingsAccount extends Account{

	private double interestRate;
	
	public SavingsAccount(double balance, Customer owner) {
		super(balance, owner);
		super.setAccountType("Saving");
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	

}
