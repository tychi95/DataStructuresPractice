package ds.linkedlists;

public class Node {
	private int data;
	private Node next = null; 
	
	public Node(int data) {
		this.data = data;
	}
	public Node() {
		
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void displayNode() {
		System.out.print(data);
	}
}
