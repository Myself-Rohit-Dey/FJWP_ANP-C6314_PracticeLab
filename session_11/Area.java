package session_11;

class Shape {
	// Method to get the area of a shape
	public void getArea() {
		System.out.println("Area"); // Default implementation, overridden in subclasses
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	// Override the getArea method to calculate the area of a circle
	@Override
	public void getArea() {
		System.out.println("Area of Circle: " + (double) (Math.PI * radius * radius));

	}
}

class Square extends Shape {
	private int length;

	public Square(int length) {
		this.length = length;
	}
	
	// Override the getArea method to calculate the area of a square
	@Override
	public void getArea() {
		System.out.println("Area of Square: " + (length * length));

	}
}

class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// Override the getArea method to calculate the area of a rectangle
	@Override
	public void getArea() {
		System.out.println("Area of Rectangle: " + (width * height));

	}
}

//Main Class
public class Area {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Square square = new Square(4);
		Rectangle rectangle = new Rectangle(4, 5);

		circle.getArea();
		square.getArea();
		rectangle.getArea();
	}
}

/*
Output:

Area of Circle: 78.53981633974483
Area of Square: 16
Area of Rectangle: 20

*/