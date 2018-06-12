package ds.circularlinkedlists;

public class NodeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(14);
		list.insertFirst(49);
		list.insertFirst(31);
		list.insertFirst(58);
		list.insertLast(12);
		list.displayList();
	}
}
