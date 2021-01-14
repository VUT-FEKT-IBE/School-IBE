package BinaryTree;

public class Tree {
	Node root;

	
	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
		} else {
			insert(root, value);
		}
	}
	
	private void insert(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println(" Inserted " + value + " to left of " + node.value);
				node.left = new Node(value);
			}
		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.value);
				node.right = new Node(value);
			}
		}
	}
	
	public void traverse(int value) {
		if (root == null) {
			System.out.println("Tree is empty");
		} else {
			traverse(root, value);
		}
	}
	
	private void traverse(Node node, int value) {
		if (node.value == value) {
			System.out.println("Value found in node "+node);
		} else if (value < node.value) {
			if (node.left != null) {
				traverse(node.left, value);
			} else {
				System.out.println("Value does not exist in tree");
			}
		} else if (value > node.value) {
			if (node.right != null) {
				traverse(node.right, value);
			} else {
				System.out.println("Value does not exist in tree");
			}
		}
	}
	

	public void traverseInOrder() {
		traverseInOrder(root);
	}
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

}
