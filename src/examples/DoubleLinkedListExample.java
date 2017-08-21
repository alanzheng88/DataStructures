package examples;

import java.util.Iterator;

import datastructure.DoubleLinkedList;
import datastructure.LLNode;

public class DoubleLinkedListExample {

	public DoubleLinkedListExample() {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.addNode(2);
		dl.addNode(4);
		dl.addNode(6);
		dl.deleteNode(4);
		dl.addNode(8);
		Iterator<LLNode<Integer>> iter = dl.iterator();
		while (iter.hasNext()) {
			LLNode<Integer> node = iter.next();
			System.out.println(node.getData());
		}
	}
}
