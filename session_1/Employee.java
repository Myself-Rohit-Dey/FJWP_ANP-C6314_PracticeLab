package session_1;

public class Employee {
	
	protected int id;
	protected int age;
	protected String name;
	protected boolean isPermanent;

	public static void main(String[] args) {
		 Employee employee = new Employee();
		 employee.age = (int) 35.5; // Casting double to int
		 System.out.println("Employee Age: "+employee.age);
		 System.out.println("Successfully started");
	}

}

/*
Output:

Employee Age: 35
Successfully started

 */