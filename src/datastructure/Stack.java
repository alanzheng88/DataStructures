package datastructure;

public class Stack<T> {

	LLNode<T> top;
	
	public void push(T data) {
		LLNode<T> node = new LLNode<>(data);
		node.next = top;
		top = node;
	}
	
	public LLNode<T> pop() {
		if (top != null) {
			LLNode<T> popped = top;
			top = top.next;
			return popped;
		}
		return null;
	}
	
}
