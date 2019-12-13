package collections.list;

import collections.list.LinkedList.Node;

public class IntersectionOf2List {

	public Node getIntersectionNode(Node head1, Node head2) {
		int length1=0,length2=0;
		int diff=0; Node ptr1= head1, ptr2= head2;
		for(Node temp=head1;temp!=null;temp=temp.next) {
			length1++;
		}
		for(Node temp=head2;temp!=null;temp=temp.next) {
			length2++;
		}
		if(length1>length2) {
			diff=length1-length2;
			for(int i=0;i<diff;i++) {
				ptr1= ptr1.next;
			}
		}else {
			diff=length2-length1;
			for(int i=0;i<diff;i++) {
				ptr2= ptr2.next;
			}
		}
		while(ptr1!=null && ptr2!=null) {
			if(ptr1==ptr2) {
				return ptr1;
			}
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		return null;
	}
}
