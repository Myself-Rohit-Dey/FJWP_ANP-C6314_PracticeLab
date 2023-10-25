package session_6;

import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for five subjects (out of 100 each):");
        double totalMarks = 0;
        
        // Loop to input marks for five subjects
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            double subjectMarks = sc.nextDouble();
            totalMarks += subjectMarks;
        }
        
        double average = totalMarks / 5;
        System.out.println("");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        
        String grade;
        
        // Determining the grade based on the average marks
        if (average > 90) {
            grade = "Ex";
        } else if (average > 80) {
            grade = "A";
        } else if (average > 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }
        
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}


/*
Output:

Enter marks for five subjects (out of 100 each):
Subject 1: 100
Subject 2: 50
Subject 3: 55
Subject 4: 65
Subject 5: 75
Total Marks: 345.0
Average Marks: 69.0
Grade: B

*/
