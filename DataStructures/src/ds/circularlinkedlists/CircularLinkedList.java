package ds.circularlinkedlists;

import ds.linkedlists.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node nu = new Node(data);
		if(isEmpty()) {
			last = nu;
		}
		nu.setNext(first);
		first = nu;
	}
	
	public void insertLast(int data) {
		Node nu = new Node(data);
		if(isEmpty()) {
			last = nu;
		} else {
			last.setNext(nu);
			nu = last;
		}
	}
	
	public int delete() {
		int temp;
		if(isEmpty()) {
			return -1;
		} else if(first.getNext() == null) {
			last = null;
		}
		temp = first.getData();
		first = first.getNext();
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last)");
		Node curr = first;
		while(curr != null) {
			curr.displayNode();
			curr = curr.getNext();
			System.out.print(" ");
		}
	}
}
