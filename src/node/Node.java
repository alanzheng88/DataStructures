package node;

public class Node<T> {
	public Node<T> prev;
	public Node<T> next;
	T data;
	
	public Node(T data) {
		this.data = data;
		prev = null;
		next = null;
	}
	
	public T getData() {
		return data;
	}
}