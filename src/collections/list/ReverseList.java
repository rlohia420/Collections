package collections.list;

import collections.list.LinkedList.Node;

public class ReverseList {

	private FindMiddleElement middle = new FindMiddleElement();

	public Node reverseList(Node head) {
		Node current = head;
		Node previous = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public boolean isPallindrom(Node head) {
		Node middleNode = middle.findMiddleElement(head);
		Node secondNode = middleNode.next;
		Node reversedNode = reverseList(secondNode);
		while (head != null && reversedNode != null) {
			if (head.data == reversedNode.data) {
				head = head.next;
				reversedNode = reversedNode.next;
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}
