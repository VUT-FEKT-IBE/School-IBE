package Linearni.seznam;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public void insert(int data) {
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (head == null) {
			head = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node last = head;
			head = new_node;
			head.next = last;
		}

		// Return the list by head
	}

	public void deleteFirst() {
		// If the Linked List is empty,
		// then make the new node as head
		if (head == null) {
			return;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			head = head.next;

		}
		return;
	}

	public boolean exists(int cislo) {
		Node currNode = head;

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			if (currNode.data == cislo) {
				return true;
			}
			// Go to next node
			currNode = currNode.next;
		}
		return false;
	}

	// Method to print the LinkedList.
	public void printList() {
		Node currNode = head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
		System.out.println();
	}
}
