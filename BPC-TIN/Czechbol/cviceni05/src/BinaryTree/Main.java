package BinaryTree;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
        System.out.println("Binary Tree Example");
        tree.insert(5);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);
        tree.insert(6);
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        System.out.println();
        System.out.println("Traversing tree to find node that exists");
        tree.traverse(6);
        System.out.println();
        System.out.println("Traversing tree to find node that doesn't exist");
        tree.traverse(11);
        System.out.println();
        System.out.println("Traversing tree in order");
        tree.traverseInOrder();
        
	}
	
}
