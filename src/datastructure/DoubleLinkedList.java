package datastructure;

import java.util.Iterator;

public class DoubleLinkedList {

	private class DoubleLinkedListIterator implements Iterator<LLNode<Integer>> {

		private LLNode<Integer> currentNode;
		
		public DoubleLinkedListIterator() {
			currentNode = head;
		}
		
		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public LLNode<Integer> next() {
			LLNode<Integer> lastNode = currentNode;
			if (hasNext()) {
				currentNode = currentNode.next;
				return lastNode;
			}
			return null;
		}
	}
	
	private LLNode<Integer> head;
	private LLNode<Integer> tail;
	
	public DoubleLinkedList() {
		head = null;
		tail = null;
	}
	
	public LLNode<Integer> getHead() {
		return head;
	}
	
	public LLNode<Integer> getTail() {
		return tail;
	}
	
	public void addNode(int data) {
		LLNode<Integer> node = new LLNode<>(data);
		
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			node.prev = tail;
			tail.next = node;
			tail = node;
		}
	}
	 
	public void deleteNode(int data) {
		LLNode<Integer> current = head;
		while (current != null) {
			if (current.getData() == data) {
				current.prev.next = current.next;
				current.next.prev = current.prev;
				return;
			}
			current = head.next;
		}
	}

	public Iterator<LLNode<Integer>> iterator() {
		return new DoubleLinkedListIterator();
	}
}
