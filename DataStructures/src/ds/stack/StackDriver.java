package ds.stack;

public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack(6);
		myStack.push(28);
		myStack.push(14);
		myStack.push(38);
		System.out.println("The top is " + myStack.peak());
		myStack.push(33);
		System.out.println("The top is " + myStack.peak());
		myStack.push(81);
		myStack.push(5);
		
		while(!myStack.isEmpty()) {
			long val = myStack.pop();
			System.out.println(val);
		}
	}

}
