package ds.queue;

public class Queue {

	private int maxSize; // the number of slots
	private long[] queArray; // the slots of the queue
	private int front; // the front and oldest value in the queue
	private int rear; // the rear and newest value in the queue
	private int nItems; // counter of items in the queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(long j) {
		if(rear == maxSize) {
			rear = -1;
			nItems--;
		}
		
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
	}
	
	public long peakFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public long remove() {
		if(isEmpty()) {
			System.out.println("Sorry, the queue is empty. Use the insert function to add values.");
			return -1;
		} else {
			long val = queArray[front];
			nItems--;
			for(int i = 0; i < nItems; i++) {
				queArray[i] = queArray[i+1];
			}
			queArray[rear] = -1;
			rear--;
			return val;
		}
	}
}
