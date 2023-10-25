package session_9;

import java.util.Scanner;

public class Sort {
	public static void selectionSort(int[] arr,int n) {
        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element in the remaining unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the remaining array
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
	
	public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);

		// Number of elements in the array
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();

		// Create an array to store the input values
		int[] arr = new int[n];

		// Loop to take input in the array
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
        // Calling the sorting method sort the array
        selectionSort(arr,n);

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}


/*
Output:

Enter the number of elements in the array: 5
Enter the elements of the array: 7 9 5 6 4
Sorted array: 4 5 6 7 9 

*/