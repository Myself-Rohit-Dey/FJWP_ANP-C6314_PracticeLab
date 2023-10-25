package class_constructor;

public class Student {
	private String name;
	private int rollNo;
	private String email;
	
	//setter method
	public void setName(String stdName) {
		this.name=stdName;
	}
	public void setRollNo(int roll) {
		this.rollNo=roll;
	}
	public void setEmail(String stdEmail) {
		this.email=stdEmail;
	}
	
	//getter method
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public Student() {
		/*this.name = "Alok";
		  this.rollNo = 1;
		  this.email = "rohitdey8477@gmail.com'; 
		 */
	}
	
	//user defined parameterized constructor
	public Student(int rollNo, String name, String email) {
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}
	
	//method to display student details
	public void display() {
		//getter method to fetch the value of our variable
		System.out.println("Roll no:"+getRollNo());
		System.out.println("Name:"+getName());
		System.out.println("Email:"+getEmail());
	}
	public static void main(String[] args) {
		
		//object created using no argument constructor
		Student std = new Student();
		std.setName("Rohit");
		std.setRollNo(26);
		std.setEmail("rohitdey8477@gmail.com");
		std.display();
		
		System.out.println();//new-line
		
		//object created using parameterized constructor
		Student std2 = new Student(12,"Pabitra", "pabitra@gmail.com");
		std2.display();
	}
	
	
	
}
