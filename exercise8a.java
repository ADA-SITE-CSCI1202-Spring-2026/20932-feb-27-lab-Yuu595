public class exercise8a {
	public static void main(String[] args) {
		Person p1 = new Person("Ada", "Lovelace", "Female");
		Person p2 = new Person("Alan", "Turing", "Male");
		Person p3 = new Person("Ada", "Lovelace", "Female");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 equals p2? " + p1.equals(p2));
		System.out.println("p1 equals p3? " + p1.equals(p3));
	}

}

class Person {
	private String firstName;
	private String lastName;
	private String gender;

	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.gender = "";
	}

	public Person(String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getGender() { return gender; }

	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setGender(String gender) { this.gender = gender; }

	@Override
	public String toString() {
		return "First Name=" + firstName + ", Last Name=" + lastName + ", Gender=" + gender;
	}


}
