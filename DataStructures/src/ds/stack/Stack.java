package ds.stack;

public class Stack {

		private int maxSize;
		private long[] stackArray;
		private int top;
		
		public Stack(int size) {
			this.maxSize = size;
			this.stackArray = new long[maxSize];
			this.top = -1;
		}
		
		public void push(long j) {
			if(isFull()) {
				System.out.println("Sorry, the stack is full. Use the pop function to remove values");
			} else {
				top++;
				stackArray[top] = j;
			}
		}
		
		public long pop() {
			if(isEmpty()) {
				System.out.println("Sorry, the stack is empty. Use the push function to add values");
				return -1;
			} else {
				top--;
				return stackArray[top+1];
			}
		}
		
		public long peak() {
			if(isEmpty()) {
				System.out.println("Sorry, the stack is empty. Use the push function to add values");
				return -1;
			} else {
				return stackArray[top];
			}
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
		
		public boolean isFull() {
			return (top == maxSize-1);
		}
}
