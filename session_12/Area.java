package session_12;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	// Override the calculateArea method to calculate the area of a circle
	@Override
	public void calculateArea() {
		System.out.println("Area of Circle: " + (double) (Math.PI * radius * radius));

	}
}

class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// Override the calculateArea method to calculate the area of a rectangle
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle: " + (width * height));

	}
}

public class Area {
    public static void main(String[] args) {
    	Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 5);

		circle.calculateArea();
		rectangle.calculateArea();
    }
}


/*
Output:

Area of Circle: 78.53981633974483
Area of Rectangle: 20

*/