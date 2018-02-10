package ds.queue;

public class QueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue(6);
		myQueue.insert(28);
		myQueue.insert(14);
		myQueue.insert(38);
		System.out.println("The front is " + myQueue.peakFront());
		myQueue.insert(33);
		myQueue.insert(81);
		myQueue.insert(5);
		myQueue.view();
		System.out.println("\n");
		
		while(!myQueue.isEmpty()) {
			long val = myQueue.remove();
			System.out.println("Removing " + val);
			myQueue.view();
			System.out.println("\n");
		}
	}

}
