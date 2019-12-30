package collections.list;

import collections.list.LinkedList.Node;

public class SwapAndSortLinkedList {
	public void sort(Node head) {
		int counter = 0;
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			counter++;
		}
		if (counter > 1)
			for (int i = 0; i < counter - 1; i++) {
				Node currentNode = head;
				Node next = head.next;
				for (int j = 0; j < (counter - 1); j++) {
					if (currentNode.data > next.data) {
						Node temp= new Node(0);
						temp.data= currentNode.data;
						currentNode.data = next.data;
						next.data = temp.data;
					}
					currentNode = next;
					next = next.next;
				}
			}

	}

	public void swap(Node head, Node X, Node Y) {
		if (head != null) {
			Node tmp = new Node(0);
			tmp.data = X.data;
			X.data = Y.data;
			Y.data = tmp.data;
		}
	}
}
