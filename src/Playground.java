import examples.*;

public class Playground {

	public static void main(String[]  args) {
//		BinaryTreeExample binaryTreeExample = new BinaryTreeExample();
//		DoubleLinkedListExample doubleLinkedListExample = new DoubleLinkedListExample();
//		HashMapExample hashMapExample = new HashMapExample();
//		QueueExample queueExample = new QueueExample();
//		StackExample stackExample = new StackExample();
//		StringBufferExample stringBufferExample = new StringBufferExample();
		
		permutation("alanz");
	}
	
	static void permutation(String str) {
		System.out.println("number of node visits: " + permutation(str, "", 0));
	}
	
	static long permutation(String beginningStr, String endingStr, long count) {
		if (endingStr.length() == 0) {
			System.out.println(beginningStr);
			return count;
		} else {
			for (int i = 0; i < endingStr.length(); i++) {
				String remainder = endingStr.substring(0, i) + endingStr.substring(i + 1);
				count = permutation(beginningStr + endingStr.charAt(i), remainder, count + 1);
			}
		}
		return count;
	}
	
	
}
