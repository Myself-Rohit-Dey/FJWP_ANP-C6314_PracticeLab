package session_7;

import java.util.Scanner;

public class ArmstrongNumber {
	// Method to print Armstrong numbers in a given range
	public static void printArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
        	int number = i;
	        int sum = 0; 
	        while (number > 0) {
	        	int cube = 1;
	            int digit = number % 10;
	            // Calculate the cube of the digit without Math.pow()
	            for(int j = 0; j < 3; j++) {
	            	cube = cube * digit;
	            }
	            sum += cube;
	            number /= 10;
	       }
	       // Check if the number is an Armstrong number
	       if(i == sum) {
	    	   System.out.println(i);
	       }       
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Read the start and end values from the user
		System.out.print("Enter Start: ");
		int start = sc.nextInt();
		System.out.print("Enter End: ");
		int end = sc.nextInt();
		
		// Call the method to print Armstrong numbers in the specified range
		printArmstrongNumbers(start, end);
		
        sc.close();		
	}
}


/*
Output:

Enter Start: 100
Enter End: 999
153
370
371
407

*/