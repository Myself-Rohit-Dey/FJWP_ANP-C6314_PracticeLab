package session_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionHandling  {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        	//Asking for user input
            System.out.print("Enter an integer: ");
            int input = sc.nextInt();
            System.out.println("Value of the Integer : " + input);
        // Handling InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
    }
}

/*
Output:

Enter an integer: 7
Value of the Integer : 7

Enter an integer: c
InputMismatchException: Please enter a valid integer.

*/