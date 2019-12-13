package collections.list;

import collections.list.LinkedList.Node;

public class FindMiddleElement {

	public Node findMiddleElement(Node head) {
		Node slwPtr = head;
		Node fastPtr = head;
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slwPtr = slwPtr.next;
		}
		System.out.println("middle lement : "+slwPtr.data);
		return slwPtr;
	}
}
