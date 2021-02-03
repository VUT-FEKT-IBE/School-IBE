package cz.vutbr.feec.cviko5;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.find(1);
		
		tree.add2Tree(5);
		tree.add2Tree(7);
		tree.add2Tree(2);
		tree.add2Tree(1);
		tree.add2Tree(9);
		tree.add2Tree(4);
		tree.add2Tree(8);
		tree.add2Tree(10);
		tree.add2Tree(10);
		
		
		tree.find(1);
		tree.find(2);
		tree.find(4);
		tree.find(5);
		tree.find(7);
		tree.find(8);
		tree.find(9);
		tree.find(10);
		tree.find(11);
		
		System.out.println();
	}

}
