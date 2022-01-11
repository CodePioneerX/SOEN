import java.util.Scanner;
// -----------------------------------------------------
// Assignment 1
// Written by: Haris Mahmood, ID: 40135271
// -----------------------------------------------------


						//*****************************************
						//*		WELCOME 		  *
						//*****************************************

public class MyFirstProgram 
{

	public static void main(String[] args) 
	{
		//---------------------------------------------------------------------------------------------------
		//Part 1
		// * This is a basic program that utilizes hard coded lines to display an output. *
		
		//System.out.println --> used to produce statements that can be displayed in the output (Device)
		System.out.println("Welcome to My First Java Program!");
		System.out.println("This Program was written by: Haris Mahmood");
		System.out.println("The assignment was done individually on Friday December 31, 2021 at 6:43:12 PM.");
		System.out.println("End of Program!");
		//---------------------------------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------------------------------
		//Part 2
		// * This is a basic program that take input from user and based on the input calculates the various apps and songs they can purchase.

		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("\nHow much money do you wish to prepay?");
		int money= keyboard.nextInt();
		
		System.out.println("With this amount, you will be able to purchase " + (money/3) + " app(s). You will then have "+ (money%3) +"$ left as a credit on your account.");
		int apps= (money/7);
		int remainingAmount= money-(apps*7);
		int amountOfApps= remainingAmount/3;
		int remainingBalance= remainingAmount%3;
		System.out.println("Alternatively, for this amount, you will be able to purchase "+ apps + " song(s) and "+ amountOfApps + " app(s). You will then have "+ remainingBalance +"$ left as a credit on your\n" + "account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		//---------------------------------------------------------------------------------------------------
		
		keyboard.close();		//Closing the Scanner
		
	}

}

// End of Program


