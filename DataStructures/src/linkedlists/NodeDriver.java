package linkedlists;

public class NodeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node();
		nodeA.setData(4);
		
		Node nodeB = new Node();
		nodeB.setData(3);
		
		Node nodeC = new Node();
		nodeC.setData(7);
		
		Node nodeD = new Node();
		nodeD.setData(8);
		
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
	
		System.out.println(listLength(nodeA)); // 4
		System.out.println(listLength(nodeB)); //3
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(14);
		list.insertFirst(49);
		list.insertFirst(31);
		list.insertFirst(58);
		list.insertLast(12);
		list.displayList();
	}
	
	public static int listLength(Node nNode) {
		Node currNode = nNode;
		int length = 0;
		while(currNode != null) {
			length++;
			currNode = currNode.getNext();
		}
		return length;
	}

}
