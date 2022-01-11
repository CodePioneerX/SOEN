import java.util.Scanner;
// -----------------------------------------------------
// Assignment 2
// Written by: Haris Mahmood, ID: 40135271
// -----------------------------------------------------


						//*****************************************
						//*		WELCOME 		  *
						//*****************************************

/* Calculator that asks for the user to enter number of items with a given limit, price of those items within
the limit, GST and QST of the products within a given limit. It then provides the calculation of what will be the total amount.*/

public class CashierCalculator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);			//Taking users inputs
		int countMistakes=0;								//Counts total number of incorrect values entered

		int numberOfItems=0;								
		final int minItems=1;
		final int maxItems=10;
		if(numberOfItems<minItems || numberOfItems> maxItems)
		{
			System.out.printf("Please enter the number of items bought [1...10]: ");
			numberOfItems=keyboard.nextInt();
			
			while(numberOfItems<minItems|| numberOfItems>maxItems)					//It will only enter here if in above the value enter was not satisfactory
			{
				System.out.printf("Please enter the number of items bought [1...10]: ");
				numberOfItems=keyboard.nextInt();
				countMistakes++;														//Increments the variable value to account for error
			}
			
		}
		
		int[] priceOfItems = new int[numberOfItems];				//An array with size of the number of items that stores the prices
		final int minPrice=1; 
		final int maxPrice=1000;
		for(int i=0; i<priceOfItems.length;i++)
		{
			System.out.printf("Please enter the price of item "+(i+1) + " [1...1000]: ");
			priceOfItems[i]=keyboard.nextInt();
			
			while(priceOfItems[i]<minPrice || priceOfItems[i]>maxPrice)
			{
				System.out.printf("Please enter the price of item "+(i+1) + " [1...1000]: ");
				priceOfItems[i]=keyboard.nextInt();
				countMistakes++;
			}
		}
		
		float gst= -1;
		final int minGst=0;
		final int maxGst=14;
		if(gst<minGst || gst>maxGst)
		{
			System.out.printf("Please enter the tax rate of GST in %% [0...14]: ");
			gst=keyboard.nextFloat();
			
			while(gst<minGst|| gst>maxGst)
			{
				System.out.printf("Please enter the tax rate of GST in %% [0...14]: ");
				gst=keyboard.nextFloat();
				countMistakes++;
			}
		}
		
		float qst= -1;
		final int minQst=0;
		final int maxQst=17;
		if(qst<minQst || qst>maxQst)
		{
			System.out.printf("Please enter the tax rate of QST in %% [0...17]: ");
			qst=keyboard.nextFloat();
			
			while(qst<minQst || qst>maxQst)
			{
				System.out.printf("Please enter the tax rate of QST in %% [0...17]: ");
				qst=keyboard.nextFloat();
				countMistakes++;
			}
		}
		
		float subTotal=0;
		
		for(int i=0; i<priceOfItems.length;i++)
		{
			subTotal+=priceOfItems[i];
		}
		
		float subGst= ((subTotal) * (gst/100));
		float subQst= ((subTotal) * (qst/100));
		float total=subTotal + subGst +subQst;
		
		if(countMistakes!=0)			//Condition if there's no errors made then the message wont display
		{
			System.out.printf("You have entered %d invalid inputs.%n",countMistakes);
		}
		
		System.out.printf("Sub Total: 	    $ %6.2f%n",subTotal);
		System.out.printf("GST: 		    $ %6.2f%n",subGst);
		System.out.printf("QST: 		    $ %6.2f%n",subQst);
		System.out.printf("Total: 		    $ %6.2f%n",total);
		
		keyboard.close();		//Closing the Scanner
	}

}
