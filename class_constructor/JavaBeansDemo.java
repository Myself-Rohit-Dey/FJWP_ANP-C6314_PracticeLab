package class_constructor;


class Employee{
	private int empId;
	private String empName;
	private boolean isActive;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

	public Employee(int empId, String empName, boolean isActive) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.isActive = isActive;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}


public class JavaBeansDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Alok");
		emp1.setActive(true);
		
		System.out.println(emp1.getEmpId()+" "+emp1.getEmpName()+" "+emp1.isActive());
		System.out.println();
		
		Employee emp2 = new Employee(2, "Rohit", true);
		System.out.println(emp2.getEmpId()+" "+emp2.getEmpName()+" "+emp2.isActive());
	}
}
