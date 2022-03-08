package uni.fmi.bachelors;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// person
	String name;
	int age;
	// student
	String facultyNumber;
	String courseName;
	// employee
	String personalNumber;
	String startDate;
	// faculty and staff
	String jobRole;
	// object declaration
	Student newStudent = null;
	Faculty newFaculty = null;
	Staff newStaff = null;
	// object array lists
	ArrayList<Student> listOfStudents = new ArrayList<Student>();
	ArrayList<Faculty> listOfFaculty = new ArrayList<Faculty>();
	ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
	// menu 
	boolean inputInformation = true;
	// writes input into array lists
	while(inputInformation) {
		System.out.println("=================" + '\n'
						+  "1. Add student" + '\n'
						+  "2. Add faculty" + '\n'
						+  "3. Add staff" + '\n'
						+  "0. Proceed to print" + '\n'
						+  "=================");
		try {
			switch (Integer.parseInt(input.nextLine())) {
			case 1:
				System.out.println("Enter name: ");
				name = input.nextLine();
				System.out.println("Enter age: ");
				age = Integer.parseInt(input.nextLine());
				System.out.println("Enter faculty number: ");
				facultyNumber = input.nextLine();
				System.out.println("Enter course: ");
				courseName = input.nextLine();
				newStudent = new Student(name, age, facultyNumber, courseName);
				listOfStudents.add(newStudent);
				newStudent = null;
				break;
			case 2:
				System.out.println("Enter name: ");
				name = input.nextLine();
				System.out.println("Enter age: ");
				age = Integer.parseInt(input.nextLine());
				System.out.println("Enter personal number: ");
				personalNumber = input.nextLine();
				System.out.println("Enter start date (DD.MM.YYYY): ");
				startDate = input.nextLine();
				System.out.println("Enter job role (assistant, associate professor, professor): ");
				jobRole = input.nextLine();
				newFaculty = new Faculty(name, age, personalNumber, startDate, jobRole);
				listOfFaculty.add(newFaculty);
				newFaculty = null;
				break;
			case 3:
				System.out.println("Enter name: ");
				name = input.nextLine();
				System.out.println("Enter age: ");
				age = Integer.parseInt(input.nextLine());
				System.out.println("Enter personal number: ");
				personalNumber = input.nextLine();
				System.out.println("Enter start date (DD.MM.YYYY): ");
				startDate = input.nextLine();
				System.out.println("Enter job role (school department, secretary): ");
				jobRole = input.nextLine();
				newStaff = new Staff(name, age, personalNumber, startDate, jobRole);
				listOfStaff.add(newStaff);
				newStaff = null;
				break;
			case 0:
				inputInformation = false;
				break;
			default:
				System.out.println();
				continue;
			}
		} catch (Exception e) {
			System.out.println("Invalid data, please try again!");
			System.out.println();
			continue;
		}
		System.out.println();
	}
	// prints contents of array lists
	if (listOfStudents != null) {
		for (Student s : listOfStudents) {
			s.getInfo();
		}
	}
	if (listOfFaculty != null) {
		for (Faculty f : listOfFaculty) {
			f.getInfo();
		}
	}
	if (listOfStaff != null) {
		for (Staff s : listOfStaff) {
			s.getInfo();
		}
	}
	
	/*
	// WITHOUT USER INPUT
	Student studentOne = new Student("Ivan", 25, "2101321056", "Software Engineering");
	Faculty facultyOne = new Faculty("Petur", 40, "1234567890", "21.01.2021", "Associate professor");
	Staff staffOne = new Staff("Georgi", 35, "0987654321", "10.3.2019", "Secretary");	
	// PRINTS DATA IN OBJECTS
	System.out.println(studentOne.toString());
	System.out.println(facultyOne.toString());
	System.out.println(staffOne.toString());
	// OR
	studentOne.getInfo();
	facultyOne.getInfo();
	staffOne.getInfo();	
	*/
	
	input.close();
	}
}
