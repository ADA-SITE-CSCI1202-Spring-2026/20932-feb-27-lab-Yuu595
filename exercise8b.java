public class exercise8b {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Grace", "Hopper", "Female",
                "Computer Science", new String[]{"CS101", "CS102"});
        Teacher t2 = new Teacher("Grace", "Hopper", "Female",
                "Computer Science", new String[]{"CS101", "CS102"});
        Teacher t3 = new Teacher("Ken", "Thompson", "Male",
                "Computer Science", new String[]{"CS201"});

        System.out.println(t1);
        System.out.println("t1 equals t2? " + t1.equals(t2));
        System.out.println("t1 equals t3? " + t1.equals(t3));
    }
}

class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return "First Name=" + firstName +
               ", Last Name=" + lastName +
               ", Gender=" + gender;
    }
}

class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
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
        return super.toString() +
               ", Department=" + department +
               ", Courses=" + java.util.Arrays.toString(courses);
    }

    public boolean equals(Teacher t) {
        return getFirstName().equals(t.getFirstName()) &&
               getLastName().equals(t.getLastName()) &&
               getGender().equals(t.getGender()) &&
               department.equals(t.department) &&
               java.util.Arrays.equals(courses, t.courses);
    }
}