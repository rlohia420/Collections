package collections.stackAndQueue;

public class StackImplemetationUsingArray {

	int size;
	int arr[]= {0};
	int top;
	StackImplemetationUsingArray(int size){
		this.size=size;
		this.arr = new int[size];
		this.top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void push(int pushedElement) {
		if(!isFull()) {
			top++;
			arr[top]=pushedElement;
		}else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if(!isEmpty()) {
			int returnTop = arr[top];
			top--;
			return returnTop;
		}else {
			System.out.println(" stack is empty ");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.out.println(" Empty stack ");
			return -1;
		}
	}
	
	public boolean isFull() {
		return (size-1==top);
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Empty stack ");
		}else{
			int x = peek();
			pop();
			printStack();
			System.out.println(x +" ");
			push(x);
		}
	}
	public static void main(String args[]) {
		StackImplemetationUsingArray stack = new StackImplemetationUsingArray(4);
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.printStack();
	}
}
