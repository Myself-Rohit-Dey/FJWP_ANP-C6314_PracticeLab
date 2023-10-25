package session_3;

public class Calculator {
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	//overloading add method
	public int add(int a, int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	//overloading add method
	public double add(double a, double b) {
		double sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("1+2 = "+c.add(1,2));
		System.out.println("1+2+5 = "+c.add(1,2,5));
		System.out.println("2.3+3.5 = "+c.add(2.3,3.5));
	}
}

/*
Output:
 
1+2 = 3
1+2+5 = 8
2.3+3.5 = 5.8

 */
