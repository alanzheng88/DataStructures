import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import linkedlist.*;
import node.Node;
import queue.Queue;
import stack.Stack;
import tree.BinaryTree;

public class Playground {

	public static void main(String[]  args) {

		/*
		// HashMap
		List<Student> studentList = buildStudentList();
		hashMapPractice(studentList);
		
		String[] words = {"alan", "bob", "cat", "dog"};
		System.out.println("sentence is: " + makeSentence(words));
		

		System.out.println("int char: "  + (char)('a' + 1));
		System.out.println("int " + Character.getNumericValue('a'));
		*/
		

		/*
		// Double LinkedList
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.addNode(2);
		dl.addNode(4);
		dl.addNode(6);
		dl.deleteNode(4);
		dl.addNode(8);
		Iterator<Node> iter = dl.iterator();
		while (iter.hasNext()) {
			Node node = iter.next();
			System.out.println(node.getData());
		}
		*/
		
		/*
		// Stack
		Stack<Integer> stack = new Stack<>();
		stack.push(7);
		stack.push(6);
		stack.push(1);
		stack.push(2);
		
		Node<Integer> node;
		while ((node = stack.pop()) != null) {
			System.out.println(node.getData());
		}
		*/
		
		/*
		// Queue
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(3);
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(10);
		Node<Integer> node;
		while ((node = queue.dequeue()) != null) {
			System.out.println(node.getData());
		}
		*/
		
		/*
		// Binary Tree
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
		*/
		
	}
	
	private static String makeSentence(String[] words) {
		StringBuffer sentence = new StringBuffer(); 
		for (String w : words) sentence.append(w);
		return sentence.toString();
	}
	
	private static List<Student> buildStudentList() {
		List<Student> studentList = new ArrayList<>();
		Student alanZ = new Student("Alan", 22);
		Student alanP = new Student("Alan", 22);
		Student Dex = new Student("Dex", 17);
		Student bobG = new Student("Bob", 20);
		Student bobT = new Student("Bob", 20);
		studentList.add(alanZ);
		studentList.add(alanP);
		studentList.add(Dex);
		studentList.add(bobG);
		studentList.add(bobT);
		return studentList;
	}
	
	private static void hashMapPractice(List<Student> studentList) {
		HashMap<String, Integer> map = new HashMap<>();
		for (Student student : studentList) {
			map.put(student.getFirstName(), student.getAge());
		}
		
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, Integer> entry = entries.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		int value = map.get("Dex");
		System.out.println("value for Dex: " + value);
	}
	
	
}
