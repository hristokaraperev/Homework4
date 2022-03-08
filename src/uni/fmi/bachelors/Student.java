package uni.fmi.bachelors;

public class Student extends Person {
	private String facultyNumber;
	private String courseName;
	
	public Student(String name, int age, String facultyNumber, String courseName) {
		super(name, age);
		this.facultyNumber = facultyNumber;
		this.courseName = courseName;
	}
	
	public void getInfo() {
		System.out.println("=== Student ===" + '\n'
						+  "Name: " + getName() + '\n'
						+  "Age: " + getAge() + '\n'
						+  "Faculty number: " + getFacultyNumber() + '\n'
						+  "Course: " + getCourseName() + '\n'
						+  "===============");
	}
	
	@Override
	public String toString() {
		return "Student [getFacultyNumber()=" + getFacultyNumber() + ", getCourseName()=" + getCourseName()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
