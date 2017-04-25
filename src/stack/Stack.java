package stack;

import node.Node;

public class Stack<T> {

	Node<T> top;
	
	public void push(T data) {
		Node<T> node = new Node<>(data);
		node.next = top;
		top = node;
	}
	
	public Node<T> pop() {
		if (top != null) {
			Node<T> popped = top;
			top = top.next;
			return popped;
		}
		return null;
	}
	
}
