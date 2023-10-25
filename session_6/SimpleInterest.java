package session_6;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();
        
        double interestRate;
        
        //assigning the interestRate using if-else-if
        if (principal > 10000) {
            interestRate = 0.10; // 10% interest rate
        } else if (principal >= 5000) {
            interestRate = 0.08; // 8% interest rate
        } else {
            interestRate = 0.05; // 5% interest rate
        }
        
        double simpleInterest = (principal * interestRate * time);
        
        System.out.println("Simple Interest: " + simpleInterest);
        
        sc.close();
    }
}


/*
Output:

Enter the principal amount: 15000
Enter the time (in years): 3
Simple Interest: 4500.0

Enter the principal amount: 9500
Enter the time (in years): 3
Simple Interest: 2280.0
*/