package cz.vutbr.feec.cviko1;

public class Item {

	private int data;

	public Item(int data) {

		this.data = data;

	}

	public int getData() {

		return data;

	}

	public void setData(int data) {

		this.data = data;

	}

	public static void main(String[] args) {

		Item i1 = new Item(3);

		Item i2 = new Item(7);

		i1.setData(i2.getData());

		System.out.println("i1=" + i1.getData() + ", i2=" + i2.getData());

	}

}