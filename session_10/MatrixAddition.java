package session_10;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Create two matrices
        Integer[][] matrix1 = new Integer[rows][columns];
        Integer[][] matrix2 = new Integer[rows][columns];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Performing matrix addition
        Integer[][] resultMatrix = new Integer[rows][columns];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Displaying the sum of two matrix
        System.out.println("Sum of Two Matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


/*

Output 1: 

Enter the number of rows: 2
Enter the number of columns: 2
Enter elements for the first matrix: 
1 2
3 4
Enter elements for the second matrix: 
5 6
7 8
Sum of Two Matrices:
6 8 
10 12 


Output 2:

Enter the number of rows: 3
Enter the number of columns: 2
Enter elements for the first matrix: 
1 2
3 4
5 6
Enter elements for the second matrix: 7 8
9 10
11 12
Sum of Two Matrices:
8 10 
12 14 
16 18 

*/