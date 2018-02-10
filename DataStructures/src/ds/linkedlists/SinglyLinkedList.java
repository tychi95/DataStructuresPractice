package ds.linkedlists;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		Node temp = first;
		this.first = newNode;
		this.first.setNext(temp);
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		Node temp = first;
		if(temp == null) {
			first = newNode;
		} else {
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);;
		}
	}
	
	public Node deleteFirst() {
		Node temp = first;
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
