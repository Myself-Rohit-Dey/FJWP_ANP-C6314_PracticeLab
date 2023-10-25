package session_7;

import java.util.Scanner;

public class GrossSalary {
	// Method to calculate the gross salary based on the basic salary
	public static int calSal(int basic) {
        int hra, da;
        if (basic > 15000) {
            hra =(int) (0.20 * basic);
            da =(int) (0.60 * basic);
        } else {
            hra = 3000;
            da =(int) (0.70 * basic);
        }

        int grossSalary = basic + hra + da;
        return grossSalary;
    }
	
    public static void main(String[] args) {
        int condition = 1 ;
        Scanner sc = new Scanner(System.in);
    	while(condition != -1){
    		System.out.print("If you want to exit write -1: ");
    		int choice = sc.nextInt();
    		// Check if the user wants to exit
    		if(choice==-1) {
    			break;	// Exit the loop if the choice is -1
    		}
    		System.out.print("Enter the basic salary: ");
    		int basic = sc.nextInt();
    		System.out.println("Gross Salary: "+ GrossSalary.calSal(basic));
    	}
    	sc.close();      
    }
}


/*

Output:

If you want to exit write -1: 1
Enter the basic salary: 14000
Gross Salary: 26800
If you want to exit write -1: 1
Enter the basic salary: 16000
Gross Salary: 28800
If you want to exit write -1: -1

*/