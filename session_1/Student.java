package session_1;

public class Student {
	private String studentName;
	private String collegeName;
	private int studentID;

	//getter methods
	public String getStudentName() {
		return studentName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public int getStudentID() {
		return studentID;
	}
	
	//Parameterized Constructor
	public Student(String studentName, String collegeName, int studentID) {
	    this.studentName = studentName;
	    this.collegeName = collegeName;
	    this.studentID = studentID;
	}
	
	//Display method
	public void display() {
		System.out.println("Student Name: "+getStudentName());
		System.out.println("Student College Name: "+getCollegeName());
		System.out.println("Student ID: "+getStudentID());
	}
	

	public static void main(String[] args) {
		Student s = new Student("Rohit Dey","MCKV Institute of Engineering",26);
	    s.display();
		System.out.println("Successful");
	}
}

/*
Output:

Student Name: Rohit Dey
Student College Name: MCKV Institute of Engineering
Student ID: 26
Successful

 */
