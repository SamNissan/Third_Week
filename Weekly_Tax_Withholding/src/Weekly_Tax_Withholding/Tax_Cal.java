/* This code is designed to calculate the weekly average tax withholding 
 for a customer given the following weekly income guidelines:
Income less than $500: tax rate 10%
Incomes greater than/equal to $500 and less than $1500: tax rate 15%
Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
Incomes greater than/equal to $2500: tax rate 30%           
 */

//Author: Sam G. Nissan
//Date: 08/25/2024

package Weekly_Tax_Withholding;

import java.util.Scanner;                           //import Scanner class to get user input can be found in java.util package

public class Tax_Cal {
	
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);    //Create Scanner object "input" to enable the application to accept input from the keyboard 
		String firstName, lastName;               //declaring customer first name and last variables
		String userInput;
		String user;
		double weeklyIncome;                     
		double taxRate;
		double taxToPay;
		
		System.out.println("Hi There. This application Will ask you about your weekly income to calculate your weekly tax withholding");
		System.out.println("To continue, type Con or Continue.  Type Quit to exit");
		userInput = input.nextLine();
		user = userInput.toLowerCase();    //Convert to lower case no matter if user type in CAPS or Lower case.
		
		if(user.equals("con") || user.equals("continue")) {
			System.out.println("What is your first Name? ");
			firstName = input.next();
			
			System.out.println("What is your last Name? ");
			lastName = input.next();
			
			System.out.println("What is your weekly income? ");
			weeklyIncome = input.nextDouble();
			
			if(weeklyIncome < 500) {taxRate = 0.10; }           //Set the Tax bracket to 10% for weekly income less than $500		
					
			else if (weeklyIncome < 1500) {taxRate = 0.15;}    //Set the Tax bracket to 15% for weekly income less than $1500
			
			else if(weeklyIncome < 2500 ) {taxRate = 0.20;}   //Set the Tax bracket to 20% for weekly income less than $2500
			
			else {taxRate = 0.30;}                           //Set the Tax bracket to 30% for weekly income greater or equal $2500
			
			taxToPay = weeklyIncome * taxRate;              // Calculating the weekly tax withholding 
			
			System.out.println("");                        //white space between the lines
			
			System.out.println(firstName + " " + lastName + "'s Weekly income is $" + String.format("%.2f", weeklyIncome));
			System.out.println("Your weekly income is within tax bracket of " + String.format("%.2f" ,taxRate * 100)+ " %.");
			System.out.println("Your weekly Tax withholding is $" + String.format("%.2f", taxToPay)); //String.format ("%.2f", variable) used to set two digits after decimal
			
		} //End of Outer IF
		
		else if(user.equals("quit")) {
			System.out.println("You choosed not to continue---Good Bye");
		}
		
		else {System.out.println("Invalid entry!");
		      System.out.println("Run the program and try again with valid entry as instructed");
		}
			
		} //End of main method
	}    //End of Class Tax_Cal

