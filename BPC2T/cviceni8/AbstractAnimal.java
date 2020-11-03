package com.vutbr.feec6;

public abstract class AbstractAnimal {
	public AbstractAnimal(byte age) {
		super();
		this.age = age;
	}
	private byte age;

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	public void sound() {
		
	}
}
