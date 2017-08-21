package datastructure;

public class LLNode<T> {
	public LLNode<T> prev;
	public LLNode<T> next;
	T data;
	
	public LLNode(T data) {
		this.data = data;
		prev = null;
		next = null;
	}
	
	public T getData() {
		return data;
	}
}