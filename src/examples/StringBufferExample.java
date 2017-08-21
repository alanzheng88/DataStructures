package examples;

public class StringBufferExample {

	public StringBufferExample() {
		String[] words = {"alan", "bob", "cat", "dog"};
		System.out.println("sentence is: " + makeSentence(words));
		System.out.println("int char: "  + (char)('a' + 1));
		System.out.println("int " + Character.getNumericValue('a'));
	}
	
	private static String makeSentence(String[] words) {
		StringBuffer sentence = new StringBuffer(); 
		for (String w : words) sentence.append(w);
		return sentence.toString();
	}
}
