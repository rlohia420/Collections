package collections.stackAndQueue;

import java.util.Stack;

public class SortStackUsingAnother {

	public Stack sortStack(Stack stack) {
		Stack tmp = new Stack<>();
		while(!stack.isEmpty()){
			int current = (int) stack.pop();
			if(!tmp.isEmpty() && (int)tmp.peek() > current) {
				stack.push(tmp.pop());
			}
			tmp.push(current);
		}
		return tmp;
	}
}
