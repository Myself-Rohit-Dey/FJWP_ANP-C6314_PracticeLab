package session_14;

import java.util.Scanner;

public class NumberConversionExceptionHandling{
	public static void main(String [] args) throws NumberFormatException,NullPointerException{
		try(Scanner sc = new Scanner(System.in)){
			//Asking for user input
			System.out.print("Enter an int as a string : ");
			String input = sc.nextLine();
			if (input.equals("")) {
				//throwing the NullPointer Exception if the input is Null
				throw new NullPointerException("NullpointerException: No input present!");
			}
			int convertedValue = Integer.parseInt(input);
			System.out.println("Converted Value : "+convertedValue)	;
		}
		// Handling NumberFormatException
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException: Please enter an integer value!");
		}
		// Handling NullPointerException
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}


/*
Output 1:
Enter an int as a string : 4
Converted Value : 4

Output 2:
Enter an int as a string : a
NumberFormatException: Please enter an integer value!

Output 3:
Enter an int as a string : 
NullpointerException: No input present!
*/




















