package cz.vutbr.feec.cviko4;

public class Main {

	public static void main(String[] args) {
		ListOf list = new ListOf();
		list.add2Start(5);
		list.add2Start(10);
		list.add2Start(8);
		
		list.include(10);
		list.include(11);
		list.include(8);
		
		list.removeFromStart();
		
		list.include(8);
	}

}
