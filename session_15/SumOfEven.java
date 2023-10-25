package session_15;

import java.util.ArrayList;

public class SumOfEven {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(8);
        numbers.add(7);
        numbers.add(92);

        // Calculate the sum of even numbers
        int evenSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }

        System.out.println("ArrayList of Numbers: " + numbers);
        System.out.println("Sum of Even Numbers: " + evenSum);
    }

    
}

/*
Output:

ArrayList of Numbers: [2, 5, 10, 8, 7, 92]
Sum of Even Numbers: 112

*/