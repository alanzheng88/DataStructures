package datastructure;

public class Queue<T> {

	LLNode<T> head;
	LLNode<T> tail;
	
	public Queue() {}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void enqueue(T data) {
		LLNode<T> node = new LLNode<>(data);
		if (head == null && tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	public LLNode<T> dequeue() {
		LLNode<T> node = head;
		if (node != null) {
			if (head == tail) {
				head = tail = head.next;
			} else {
				head = head.next;
			}
		}
		return node;
	}
	
}
