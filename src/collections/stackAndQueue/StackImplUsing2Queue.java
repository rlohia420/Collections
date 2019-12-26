package collections.stackAndQueue;

import java.util.Queue;

import collections.list.LinkedList;

public class StackImplUsing2Queue {

	Queue q1, q2;

	StackImplUsing2Queue() {
		q1 = (Queue) new LinkedList();
		q1 = (Queue) new LinkedList();
	}

	public void push(int val) {
		if (q1.size() == 0) {
			q1.add(val);
		} else {
			for (int i = 0; i < q1.size(); i++) {
				q2.add(q1.remove());
				q1.add(val);
			}
			for (int i = 0; i < q1.size(); i++) {
				q1.add(q2.remove());
			}
		}
	}
	public int pop() {
		if(q1.size()==0) {
			System.out.println(" empty queue ");
		}
		return (int) q1.remove();
	}
}
