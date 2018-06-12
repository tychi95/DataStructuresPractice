package ds.doublylinkedlists;

import ds.doublylinkedlists.Node;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int data) {
		Node nu = new Node(data);
		if(isEmpty()) {
			last = nu;
		} else {
			first.setPrev(nu);
			nu.setNext(first);
		}
		first = nu;
	}
	
	public void insertLast(int data) {
		Node nu = new Node(data);
		if(isEmpty()) {
			first = nu;
		} else {
			last.setNext(nu);
			nu.setPrev(last);
		}
		last = nu;
	}
	
	//Assume list is not empty
	public Node deleteFirst() {
		Node temp = first;
		if(first.getNext() == null) {
			last = null;
		} else {
			first.getNext().setPrev(null);
		}
		first = first.getNext();
		return temp;
	}
	
	//Assume list is not empty
	public Node deleteLast() {
		Node temp = last;
		if(first.getNext() == null) {
			first = null;
		} else {
			last.getPrev().setNext(null);
		}
		last = last.getPrev();
		return temp;
	}
	
	//Assume list is not empty
	public Node deleteKey(int key) {
		Node curr = first;
		while(curr.getData() != key) {
			curr = curr.getNext();
			if(curr == null) {
				return null;
			}
		}
		if(curr == first) {
			first = curr.getNext();
		} else {
			curr.getPrev().setNext(curr.getNext());
		}
		
		if(curr == last) {
			last = curr.getPrev();
		} else {
			curr.getNext().setPrev(curr.getPrev());
		}
		return curr;
	}
	
	public void displayForward() {
		System.out.println("List (first --> last)");
		Node curr = first;
		while(curr != null) {
			curr.displayNode();
			curr = curr.getNext();
			System.out.print(" ");
		}
	}
	
	public void displayBackward() {
		System.out.println("List (first --> last)");
		Node curr = last;
		while(curr != null) {
			curr.displayNode();
			curr = curr.getPrev();
			System.out.print(" ");
		}
	}
	
}