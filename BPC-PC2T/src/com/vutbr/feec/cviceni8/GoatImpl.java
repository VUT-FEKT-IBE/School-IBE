package com.vutbr.feec.cviceni8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GoatImpl implements Animal {
	public GoatImpl(byte age) {
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
		System.out.println("meee");

	}

	@Override
	public String toString() {
		return "GoatImpl [age=" + age + "]";
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("zviratka.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("meeee");
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
