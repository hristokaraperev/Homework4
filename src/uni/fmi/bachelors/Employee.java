package uni.fmi.bachelors;

public abstract class Employee extends Person {
	private String personalNumber;
	private String startDate;
	
	public Employee(String name, int age, String personalNumber, String startDate) {
		super(name, age);
		this.personalNumber = personalNumber;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Employee [getPersonalNumber()=" + getPersonalNumber() + ", getStartDate()=" + getStartDate()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	
}
