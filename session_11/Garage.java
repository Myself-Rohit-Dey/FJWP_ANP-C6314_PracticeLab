package session_11;

class Vehicle{
	protected String make;
	protected String model;
	protected int year;
	protected int maximumSpeed;
	
	
	//parameterized constructor
	public Vehicle(String make, String model, int year, int maximumSpeed) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	
	// Method of driving a vehicle
	public void drive() {
		System.out.println("Vehicle is driving");
	}
}

//Car inherits the parent class Vehicle
class Car extends Vehicle{

	public Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed); //super keyword to get the properties from parent
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	
	//Overriding the method drive() from Vehicle
	@Override
	public void drive() {
		System.out.println(make+" "+model+" Car is driving");
	}
	
}

//Bike inherits parent class Vehicle
class Bike extends Vehicle{

	public Bike(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);//super keyword to get the properties from parent
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	
	//Overriding the method drive() from Vehicle
	@Override
	public void drive() {
		System.out.println(make+" "+model+" Bike is driving");
	}
	
}

//Main class
public class Garage {
	public static void main(String []args) {
		Car car = new Car("Toyota","Supra",1800,250);
		Bike bike = new Bike("Yamaha","R15",200,180);
		
		car.drive();
		bike.drive();
	}
}


/*
Output:

Toyota Supra Car is driving
Yamaha R15 Bike is driving

*/