package collections.list;

import collections.list.LinkedList.Node;

public class DetectALoop {

	public Node isLoop(Node head) {
		boolean status = false;
		Node slwPtr = head;
		Node fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slwPtr = slwPtr.next;
			if (fastPtr == slwPtr) {
				status = true;
				break;
			}
		}
		System.out.println("loop is there : " + status + " looped node " + slwPtr.data);
		return slwPtr;
	}

	private int numberOfNodesInLoop(Node node) {
		Node loopedNode = isLoop(node).next;
		Node iteratorNode = loopedNode;
		int count = 0;
		iteratorNode=iteratorNode.next;
		while (loopedNode != iteratorNode) {
			iteratorNode = iteratorNode.next;
			count++;
		}
		System.out.println("node in loop "+count);
		return count;
	}

	public void deleteLoop(Node node) {
		Node head = node,loopedNode = node;
		for(int countOfNodeInLoop = numberOfNodesInLoop(node);countOfNodeInLoop>0;countOfNodeInLoop--) {
			loopedNode=loopedNode.next;
		}
		while(head!=loopedNode.next) {
			loopedNode = loopedNode.next;
			head=head.next;
		}
		loopedNode.next=null;
	}
}
