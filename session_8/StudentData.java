package session_8;

class Student {
	String name;
	int age;
	String department;

	// Default constructor
	Student() {
		name = "Unknown";
		age = 20;
		department = "Unassigned";
	}

	// Parameterized Constructor with name and age
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.department = "IT";
	}

	// Parameterized Constructor with name age and department
	Student(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}
	
	//display method
	void display() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Department: " + getDepartment());
		System.out.println("");
	}
}

public class StudentData {
	public static void main(String[] args) {
		Student s1 = new Student();//default constructor called here
		Student s2 = new Student("Anil", 21);// Parameterized Constructor with name and age is called here
		Student s3 = new Student("Subir", 22, "CSE");// Parameterized Constructor with name age and department is called here
		s1.display();
		s2.display();
		s3.display();
	}
}

/*

Output:

Name: Unknown
Age: 20
Department: Unassigned

Name: Anil
Age: 21
Department: IT

Name: Subir
Age: 22
Department: CSE

*/