package cz.vutbr.feec.zapocet;

public class NormalAccount extends Account{

	
	public NormalAccount(double balance, Customer owner) {
		super(balance, owner);
		super.setAccountType("Normal");
		

	}

	

}
