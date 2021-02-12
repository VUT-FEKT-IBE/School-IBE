package com.vutbr.feec.cviceni3.SomeCodeCryptoRegistration;


public class PBKDF2PersonRegistration extends PersonService {
	
	private Person p;
	
	@Override
	Person register(Person person) {
		// TODO Auto-generated method stub
		setP(person);
		return null;
	}

	@Override
	public void work() {
		System.out.println(p.getName() + " nepracuji");
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

}
