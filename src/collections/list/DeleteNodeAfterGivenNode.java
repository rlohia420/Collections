package collections.list;

import collections.list.LinkedList.Node;

public class DeleteNodeAfterGivenNode {

	public void deleteNodeAfterNode(Node head, Node afterNode) {
		Node temp = head;

		while (temp != null && temp.data != afterNode.data) {
			temp = temp.next;
		}
		if (temp.next != null) {
			temp.next = temp.next.next;
		}
	}

	public void pushNodeAfterGivenNode(Node prevNode, Node newNode) {
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
}
