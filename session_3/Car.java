package session_3;

public class Car {
	private String make;
	private String model;
	private short year;
	private int price;
	
	//parameterized Constructor
	public Car(String make,String model,short year,int price){
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	//getter methods
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public short getYear() {
		return year;
	}
	public int getPrice() {
		return price;
	}
	
	//display method
	public void display() {
		System.out.println("Make: "+getMake());
		System.out.println("Model: "+getModel());
		System.out.println("year: "+getYear());
		System.out.println("price: "+getPrice());
	}
	
	public static void main(String[] args) {
		Car c1= new Car("Carbon Fiber","Buggati Chiron", (short)2001, 100000000);
		Car c2= new Car("Carbon Fiber","koenigsegg Gemera", (short)2023, 200000000);
		c1.display();
		System.out.println("");
		c2.display();
	}
	
}

/*
Output:

Make: Carbon Fiber
Model: Buggati Chiron
year: 2001
price: 100000000

Make: Carbon Fiber
Model: koenigsegg Gemera
year: 2023
price: 200000000
*/