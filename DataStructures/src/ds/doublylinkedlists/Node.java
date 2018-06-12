package ds.doublylinkedlists;

public class Node {
	private int data;
	private Node next = null; 
	private Node prev = null;
	
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
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return prev;
	}
	
	public void displayNode() {
		System.out.print(data);
	}
}
