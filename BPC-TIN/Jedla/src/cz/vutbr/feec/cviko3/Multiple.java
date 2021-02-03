package cz.vutbr.feec.cviko3;

import java.util.ArrayList;

public class Multiple extends Object {

	ArrayList<Object> objects = new ArrayList<Object>();

	public Multiple() {
		super();
	}

	public void addObject(Object object) {
		objects.add(object);
	}

	public void printObjects() {
		for (int i = 0; i < objects.size(); i++) {
			System.out.println(objects.get(i));
		}
	}

	@Override
	public String toString() {
		this.printObjects();
		return "";
	}

	@Override
	public void printObj() {
		for (int i = 0; i < objects.size(); i++) {
			objects.get(i).printObj();
		}

	}

}
