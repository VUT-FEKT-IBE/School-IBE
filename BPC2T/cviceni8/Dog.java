package com.vutbr.feec6;

public class Dog extends AbstractAnimal{

	public Dog(byte age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sound() {
		System.out.println("haf");
	}
}
