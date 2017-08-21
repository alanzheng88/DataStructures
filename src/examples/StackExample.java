package examples;

import datastructure.LLNode;
import datastructure.Stack;

public class StackExample {

	public StackExample() {
		Stack<Integer> stack = new Stack<>();
		stack.push(7);
		stack.push(6);
		stack.push(1);
		stack.push(2);
		
		LLNode<Integer> node;
		while ((node = stack.pop()) != null) {
			System.out.println(node.getData());
		}
	}
}
