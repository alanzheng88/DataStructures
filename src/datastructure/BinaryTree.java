package datastructure;

public class BinaryTree {
	
	private Node<Integer> root;
	
	public class Node<T> {
	
		private T data;
		private Node<T> leftChild;
		private Node<T> rightChild;
		
		public Node(T data) {
			this.data = data;
		}
		
		public T getData() {
			return data;
		}
		
		@Override
		public String toString() {
			return "Node data: " + data;
		}
	}
	
	public BinaryTree() {}
	
	public Node<Integer> getRoot() {
		return root;
	}
	
	public void insert(int data) {
		Node<Integer> node = new Node<>(data);
		
		if (root == null) {
			root = node;
		} else {
			Node<Integer> current = root;
			while (true) {
				if (data <= current.getData()) {
					if (current.leftChild == null) {
						current.leftChild = node;
						break;
					} else {
						current = current.leftChild;
					}
				} else {
					if (current.rightChild == null) {
						current.rightChild = node;
						break;
					} else {
						current = current.rightChild;
					}
				}
			}
			
		}
	}
	
	public void inorderTraversal(Node<Integer> node) {
		if (node == null) return;
		inorderTraversal(node.leftChild);
		System.out.println(node.getData());
		inorderTraversal(node.rightChild);
	}
	
	public Node<Integer> depthFirstSearch(int data) {
		Node<Integer> current = root;
		while (current.getData() != data) {
			if (data <= current.getData()) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}
	
	public Node<Integer> breadthFirstSearch(int data) {
		Node<Integer> current = root;
		Queue<Node<Integer>> queue = new Queue<>();
		queue.enqueue(current);
		
		do {
			datastructure.LLNode<Node<Integer>> node = queue.dequeue();
			current = node.getData();
			
			if (current.getData() == data) {
				return current;
			}
			
//			System.out.println(current.getData());
			
			if (current.leftChild != null) {
				queue.enqueue(current.leftChild);
			}
			
			if (current.rightChild != null) {
				queue.enqueue(current.rightChild);
			}
			
		} while (!queue.isEmpty());
		
		return null;
	}
}
