package collections.list;

import collections.list.LinkedList.Node;

public class FindNthElementFromEnd {

	public Node finNthEndElement(Node head, int n) {
		Node fastPtr = head;
		Node slowPtr = head;
		for(int i=0;i<n;i++) {
			fastPtr = fastPtr.next;
		}
		while(fastPtr!=null) {
			fastPtr = fastPtr.next;
			slowPtr=slowPtr.next;
		}
		return slowPtr;
	}
}

