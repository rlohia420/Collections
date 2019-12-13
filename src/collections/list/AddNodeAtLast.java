package collections.list;

import collections.list.LinkedList.Node;

public class AddNodeAtLast {

	public void addToLast(Node head,Node node) {
		if(head==null) {
			head = node;
		}else {
			Node temp = head;
			while(temp!=null) {
				temp=temp.next;
			}temp.next=node;
		}
	}
}
