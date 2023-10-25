package session_8;

class Vehicle {
	void start() {
		System.out.println("Vehicle Started");
	}
}

//class Car extends the Parent class vehicle
class Car extends Vehicle {
	// method start() is Overrode here
	@Override
	void start() {
		System.out.println("Car Started");
	}
}

//class Motorcycle extends the Parent class vehicle
class Motorcycle extends Vehicle {
	// method start() is Overrode here
	@Override
	void start() {
		System.out.println("Motorcycle Started");
	}
}

class Garage {
	// The object reference is passed in the method serviceVehicle() to call the
	// method of using the object
	void serviceVehicle(Vehicle vehicle) {
		vehicle.start();
	}
}

public class VehicleGarage {
	public static void main(String[] args) {

		Car c1 = new Car();
		Motorcycle m1 = new Motorcycle();
		Garage g1 = new Garage();

		g1.serviceVehicle(c1);//object of Car is passed here
		g1.serviceVehicle(m1);//object of Motorcycle is passed here
	}

}

/*

Output:

Car Started
Motorcycle Started

*/