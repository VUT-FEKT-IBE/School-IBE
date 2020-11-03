package com.vutbr.feec6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PigImpl implements Animal {
	public PigImpl(byte age) {
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

	@Override
	public void sound() {
		System.out.println("chrochro");

	}

	@Override
	public String toString() {
		return "PigImpl [age=" + age + "]";
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("zviratka.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("chrochro");
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
