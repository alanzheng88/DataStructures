package examples;

import datastructure.LLNode;
import datastructure.Queue;

public class QueueExample {

	public QueueExample() {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(3);
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(10);
		LLNode<Integer> node;
		while ((node = queue.dequeue()) != null) {
			System.out.println(node.getData());
		}
	}
}
