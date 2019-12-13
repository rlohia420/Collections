package collections.list;

public class DoubleLinkedList {

	public static void main(String args[]) {
		DoubleLinkedList dll= new DoubleLinkedList();
		dll.insertFirst(5);
		dll.insertFirst(10);
		dll.insertLast(20);
		dll.printListForward();
		dll.printListBackword();
		Node node = new Node(1);
		dll.deleteAfter(node);
		dll.deleteEndNode();
		dll.deleteNode();
	}
	static class Node{
		int data;Node next,prev;
		Node(int data){
			this.data= data;
		}
	}
	private Node head,prev,tail;
	int size;
	public boolean isEmpty() {
		return (head==null);
	}
	//insertNode at start of list
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev= node;
		}
		head= node;
		if(tail==null) {
			tail=node;
		}
		size++;
	}
	public void insertLast(int data) {
		Node newNode = new Node(data);
		newNode.next=null;
		newNode.prev=tail;
		if(tail!=null) {
			tail.next=newNode;
		}
		tail=newNode;
		if(head==null) {
			head = newNode;
		}
		size++;
	}
	//Delete node from start of list
	public Node deleteNode() {
		if(size==0)
			throw new RuntimeException();
		Node temp = head;
		head = head.next;
		head.prev=null;
		size--;
		return temp;
	}
	//Delete node from end of list
	public Node deleteEndNode() {
		if(size==0)
			throw new RuntimeException();
		Node temp = tail;
		tail = tail.prev;
		tail.next=null;
		size--;
		return temp;
	}
	public void deleteAfter(Node after) {
		Node temp = head;
		while(temp.next!=null && temp.data!=after.data) {
			temp = temp.next;
		}
		if(temp.next!=null) {
			temp.next.next.prev= temp;
			temp.next= temp.next.next;
		}
	}
	public void printListForward() {
		Node current= head;
		while(current!=null) {
			System.out.println(current.data);
			current= current.next;
		}
	}
	public void printListBackword() {
		for(Node c=tail;c!=null;c=c.prev) {
			System.out.println(c.data);
		}
	}
}
