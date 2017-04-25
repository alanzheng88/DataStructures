package queue;

import node.Node;

public class Queue<T> {

	Node<T> head;
	Node<T> tail;
	
	public Queue() {}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void enqueue(T data) {
		Node<T> node = new Node<>(data);
		if (head == null && tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	public Node<T> dequeue() {
		Node<T> node = head;
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
