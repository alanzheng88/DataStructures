package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import data.Student;

public class HashMapExample {

	public HashMapExample() {
		List<Student> studentList = buildStudentList();
		hashMapPractice(studentList);
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

