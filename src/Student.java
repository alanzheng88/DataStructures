
public class Student {

	private String firstName;
	private int age;
	
	public Student(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (firstName == null ? 0 : firstName.hashCode());
		result = 31 * result + age;
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Student)) return false;
		Student other = (Student) o;
		return firstName.equals(other.firstName) && age == other.age;
	}
}
