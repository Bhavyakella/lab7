
public class driver {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(10);  // create instances of  ArrayStack 

		System.out.println("ArrayStack");

		stack.push(1);   // insert elements into the stack 

		stack.push(7);

		stack.push(3);

		stack.push(4);

		stack.push(9);

		stack.push(2);
		int val;
		do {
			val = stack.pop();   // print all popped values in ArrayStack
			if (val == -1)
				break;      // exit program 
			System.out.println(val);

		} while (val != -1);

		LinkedStack stack1 = new LinkedStack();    // create an object to LinkedStack Class
		
		System.out.println("LinkedStack");
		
		stack1.push(1);    // insert values into another stack 

		stack1.push(7);

		stack1.push(3);

		stack1.push(4);

		stack1.push(9);

		stack1.push(2);

		val = stack1.pop();

		while (val != -1) {
			System.out.println(val);   // print all popped values in LinkedStack
			val = stack1.pop();
		}

	}

}


class ArrayStack {

	private int[] array;

	private int n;

	private int size;

	public ArrayStack(int cap) {

		size = cap;

		n = 0;

		array = new int[cap];

	}

	public int size() {

		return n;

	}
    
	// push or insert method
	public void push(int item) {

		if (n == size)

			System.out.println("Stack is Overflow");

		else {

			array[n] = item;

			n++;

		}

	}
   // pop or delete method 
	public int pop() {

		int data = -1;

		if (n == 0)

			System.out.println("Stack is Underflow");

		else {

			data = array[n - 1];

			n--;

		}

		return data;   // return pop value

	}

}

class LinkedStack {

	class Node {

		int data;    // declare data and next variables

		Node next;

		Node(int node) {

			data = node;

		}

	}

	private Node top;

	private int n;

	public LinkedStack() {

		top = null;

		n = 0;

	}
	
    // use push method to insert values into LinkedStack 
	public void push(int item) {

		Node newNode = new Node(item);

		newNode.next = top;

		top = newNode;

		n++;

	}

	public int size() {

		return n;

	}
    
	// use pop method to delete the values in LinkedStack
	public int pop() {

		if (n == 0) {

			return -1;

		}

		int data = top.data;

		top = top.next;

		n--;

		return data;

	}

}
