package cz.vutbr.feec.cviko4;

public class Objects {
	
	private int number;
	private Objects next;
	
	
	public Objects(int number, Objects next) {
		super();
		this.number = number;
		this.next = next;
	}

	public Objects getNext() {
		return next;
	}

	public void setNext(Objects next) {
		this.next = next;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Objects [number=" + number + "]";
	}
	
	
}
