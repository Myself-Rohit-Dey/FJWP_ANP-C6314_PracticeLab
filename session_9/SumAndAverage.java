package session_9;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Number of elements in the array
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();

		// Create an array to store the input values
		int[] array = new int[n];

		// Loop to take input in the array
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// Calculate the sum of the elements in the array
		int sum = 0;
		for (int num : array) {
			sum += num;
		}

		// Calculate the average of the elements in the array
		double average = (double) sum / n;

		// Display the sum and average
		System.out.println("Sum of the elements: " + sum);
		System.out.println("Average of the elements: " + average);

		// Close the scanner to release resources
		sc.close();
	}
}

/*

Output 1:
Enter the number of elements in the array: 5
Enter the elements of the array: 2 4 6 9 10
Sum of the elements: 31
Average of the elements: 6.2

Output 2:
Enter the number of elements in the array: 7
Enter the elements of the array: 1 3 5 7 9 6 4
Sum of the elements: 35
Average of the elements: 5.0

*/