package uni.fmi.bachelors;

public class Faculty extends Employee {
	// only values are assistant, associate professor, professor
	private String jobRole;
	
	public Faculty(String name, int age, String personalNumber, String startDate, String jobRole) {
		super(name, age, personalNumber, startDate);
		this.jobRole = jobRole;
	}

	public void getInfo() {
		System.out.println("=== Faculty ===" + '\n'
						+  "Name: " + getName() + '\n'
						+  "Age: " + getAge() + '\n'
						+  "Personal number: " + getPersonalNumber() + '\n'
						+  "Start date: " + getStartDate() + '\n'
						+  "Job role: " + getJobRole() + '\n'
						+  "===============");
	}
	
	@Override
	public String toString() {
		return "Faculty [getJobRole()=" + getJobRole() + ", getPersonalNumber()=" + getPersonalNumber()
				+ ", getStartDate()=" + getStartDate() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
}
