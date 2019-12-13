package collections.list;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
		}
	}
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head = newNode;
	}
	
	public void printList() {
		Node n= head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}System.out.println();
	}
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.head= new Node(0);
		Node n1 = new Node(1);
		Node n2 =  new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		
		list.head.next= n1;
		list.head.next.next =n2;
		list.head.next.next.next = n3;
		list.head.next.next.next.next = n4;
		list.head.next.next.next.next.next = n5;
		list.head.next.next.next.next.next.next = n6;
		list.head.next.next.next.next.next.next.next = n7;
		list.head.next.next.next.next.next.next.next.next = n8;
		list.head.next.next.next.next.next.next.next.next.next=n9;
		list.printList();
		
		DeleteNodeAfterGivenNode deleteAndInsert = new DeleteNodeAfterGivenNode();
		deleteAndInsert.deleteNodeAfterNode(list.head,n2);
		System.out.println(" After deleting node");
		list.printList();
		
		System.out.println(" Insert Node after a given node");
		deleteAndInsert.pushNodeAfterGivenNode(n2,n3);
		list.printList();
		
		FindMiddleElement mid = new FindMiddleElement();
		System.out.println(" Find Middle lement ");
		mid.findMiddleElement(list.head);
	
		DetectALoop isLoop = new DetectALoop();
		isLoop.isLoop(list.head);
		n9.next=list.head.next.next.next.next.next; //looping node5
		isLoop.isLoop(list.head);
		isLoop.deleteLoop(list.head);
		isLoop.isLoop(list.head);
	}
}
