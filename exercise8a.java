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

class Teacher extends Person {
	private String department;
	private String[] courses;

	public Teacher() {
		super();
		this.department = "";
		this.courses = new String[0];
	}

	public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
		super(firstName, lastName, gender);
		this.department = department;
		this.courses = courses;
	}

	public String getDepartment() { return department; }
	public String[] getCourses() { return courses; }
	public void setDepartment(String department) { this.department = department; }
	public void setCourses(String[] courses) { this.courses = courses; }

	@Override
	public String toString() {
		return super.toString() + ", Department=" + department + ", Courses=" + java.util.Arrays.toString(courses);
	}

	public boolean equals(Teacher t) {
		if (t == null) return false;
		if (this == t) return true;
		boolean fn = (getFirstName() == null) ? t.getFirstName() == null : getFirstName().equals(t.getFirstName());
		boolean ln = (getLastName() == null) ? t.getLastName() == null : getLastName().equals(t.getLastName());
		boolean g = (getGender() == null) ? t.getGender() == null : getGender().equals(t.getGender());
		boolean d = (department == null) ? t.department == null : department.equals(t.department);
		boolean c = java.util.Arrays.equals(courses, t.courses);
		return fn && ln && g && d && c;
	}
}