package collections.list;

public class ReverseListInGroups {
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
		Node head;
	public Node reverseListInGroup(Node head, int k) {
		Node current = head;
		Node previous = null;
		Node next = null;
		int count =0;
		while (current != null && count<k) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}
		if(next!=null) {
			head.next = reverseListInGroup(next,k);
		}
		return previous;
	}
	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next=head;
		head = newNode;
	}
	public void printList() {
		for(Node tmp=head;tmp!=null;tmp=tmp.next) {
			System.out.print(tmp.data+ " -> ");
		}
		System.out.print(" null ");
	}
	public static void main(String args[]) {
		ReverseListInGroups c= new ReverseListInGroups();
		c.push(1);
		c.push(2);
		c.push(3);
		c.push(4);
		c.push(5);
		c.push(6);
		c.push(7);
		c.printList();
		
		c.reverseListInGroup(c.head,2);
		c.printList();
	}
}

