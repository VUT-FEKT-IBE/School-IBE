package com.vutbr.feec.cviceni8;

public class Cow extends AbstractAnimal{

	public Cow(byte age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sound() {
		System.out.println("buu");
	}
}
