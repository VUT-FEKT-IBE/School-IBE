package cz.vutbr.feec.cviko3;

import java.util.ArrayList;

public class MyCanvas{
	ArrayList<Object> data = new ArrayList<Object>();

	public MyCanvas() {
		super();
	}

	public void printData() {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
	}

	public void addData(Object object) {
		data.add(object);
	}
	
	public void multiplePrint() {
		for (int i = 0; i < data.size(); i++) {
			data.get(i).printObj();
		}
	}
}
