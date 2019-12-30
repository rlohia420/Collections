package collections.list;

import collections.list.LinkedList.Node;

public class AddNodeAtMid {

	public void addNode(Node head,Node node) {
		int count=0;
		for(Node temp =head;temp!=null;temp = temp.next ) {
			count++;
		}
		int midElement = count/2;
		Node tmp = head;
		for(int i=0;i<midElement-1;i++) {
			tmp=tmp.next;
		}
		node.next =tmp.next; 
		tmp.next=node;
	}
}
