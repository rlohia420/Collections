package collections.list;

import collections.list.LinkedList.Node;

public class StackImplementation {

	private Node top;
	public boolean isEmpty() {
		return (top==null);
	}
	public int peek() {
		return top.data;
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next=top;
		top=node;
	}
	public int pop() {
		int data = top.data;
		top=top.next;
		return data;
	}
}
