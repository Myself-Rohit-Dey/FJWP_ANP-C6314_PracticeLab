package session_13;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Calculator {
	public static void main(String[] args) {
		// Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        try {
        	//Asking for user input
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = 0;
            // Using a switch statement to perform the desired operation based on the operator entered
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                	 // Handling division by zero by catching ArithmeticException
                    try {
                    	result =(num1 / num2);
                    }
                	catch (ArithmeticException e) {
                        System.out.println("Integer Value cannot be divided by 0");
                        break;
                    } 
                    System.out.println("Result: " + result);
                    break;
                default:
                	// Handling invalid operator input
                	System.out.println("Invalid operator!");
            }
        } 
        catch (InputMismatchException e1) {
        	// Handling input mismatch exception
            System.out.println("Input Mismatch");
        } 
        finally {
        	// Closing the Scanner to release resources
            sc.close();
        }
    }
}




/*
Output 1:
Enter the first number: 43
Enter the second number: 17
Enter the operator (+, -, *, /): +
Result: 60.0

Output 2:
Enter the first number: 14
Enter the second number: 21
Enter the operator (+, -, *, /): -
Result: -7.0

Output 3:
Enter the first number: 4
Enter the second number: 5
Enter the operator (+, -, *, /): *
Result: 20.0

Output 4:
Enter the first number: 12
Enter the second number: 4
Enter the operator (+, -, *, /): /
Result: 3.0

Output 5:
Enter the first number: 1
Enter the second number: 0
Enter the operator (+, -, *, /): /
Integer Value cannot be divided by 0

Output 6:
Enter the first number: 1
Enter the second number: a
Input Mismatch

Output 7:
Enter the first number: 4
Enter the second number: 5
Enter the operator (+, -, *, /): a
Invalid operator!

*/
