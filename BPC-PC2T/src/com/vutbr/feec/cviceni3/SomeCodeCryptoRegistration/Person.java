package com.vutbr.feec.cviceni3.SomeCodeCryptoRegistration;

public class Person {
	private int id;
	private String email;
	private String name;
	private String passw;

	public Person(int id, String email, String name, String passw) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.passw = passw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}
	
}
