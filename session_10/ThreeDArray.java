package session_10;

import java.util.Random;
import java.util.Scanner;

public class ThreeDArray {

	// initialize 3d array
	public static void initialize(int[][][] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = rand.nextInt(100); // Random values between 0 and 99
				}
			}
		}
	}

	// maximize 3d array
	public static void maximize(int[][][] arr) {
		int max = arr[0][0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					if (arr[i][j][k] > max) {
						max = arr[i][j][k];
					}
				}
			}
		}
		System.out.println("Maximum value in array : " + max);
	}

	// average of 3d array
	public static void average(int[][][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					sum += arr[i][j][k];
				}
			}
		}
		double average = (double) sum / (arr.length * (arr[0].length) * (arr[0][0].length));
		System.out.println("average = " + average);
	}

	// display method
	public static void display(int[][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Level : " + i + " ");
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter levels: ");
		int levels = sc.nextInt();
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter Columns: ");
		int columns = sc.nextInt();

		int[][][] threeDArray = new int[levels][rows][columns];

		// initializing 3d array
		initialize(threeDArray);

		// find maximum value
		maximize(threeDArray);

		// find average value
		average(threeDArray);

		// display the 3d array
		display(threeDArray);

		sc.close();
	}
}


/*

Output:

Enter levels: 3
Enter rows: 3
Enter Columns: 3
Maximum value in array : 92
average = 50.81481481481482
Level : 0 
70 88 25 
72 49 52 
60 89 35 

Level : 1 
11 57 16 
92 55 64 
48 71 39 

Level : 2 
80 78 38 
34 14 68 
15 13 39 

*/