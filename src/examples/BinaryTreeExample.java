package examples;

import datastructure.BinaryTree;

public class BinaryTreeExample {

	public BinaryTreeExample() {
		BinaryTree bt = new BinaryTree();
		bt.insert(5);
		bt.insert(18);
		bt.insert(4);
		bt.insert(1);
		bt.insert(14);
		bt.insert(12);
		bt.insert(8);
		bt.inorderTraversal(bt.getRoot());
		System.out.println(bt.depthFirstSearch(18));
		System.out.println(bt.breadthFirstSearch(18));
	}
}
