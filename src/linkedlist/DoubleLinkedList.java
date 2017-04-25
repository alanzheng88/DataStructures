package linkedlist;

import java.util.Iterator;
import node.Node;

public class DoubleLinkedList {

	private class DoubleLinkedListIterator implements Iterator<Node<Integer>> {

		private Node<Integer> currentNode;
		
		public DoubleLinkedListIterator() {
			currentNode = head;
		}
		
		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public Node<Integer> next() {
			Node<Integer> lastNode = currentNode;
			if (hasNext()) {
				currentNode = currentNode.next;
				return lastNode;
			}
			return null;
		}
	}
	
	private Node<Integer> head;
	private Node<Integer> tail;
	
	public DoubleLinkedList() {
		head = null;
		tail = null;
	}
	
	public Node<Integer> getHead() {
		return head;
	}
	
	public Node<Integer> getTail() {
		return tail;
	}
	
	public void addNode(int data) {
		Node<Integer> node = new Node<>(data);
		
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
		Node<Integer> current = head;
		while (current != null) {
			if (current.getData() == data) {
				current.prev.next = current.next;
				current.next.prev = current.prev;
				return;
			}
			current = head.next;
		}
	}

	public Iterator<Node<Integer>> iterator() {
		return new DoubleLinkedListIterator();
	}
}
