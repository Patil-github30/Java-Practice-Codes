/*
 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

*/

import java.util.*;
class ArithmaticOperation
{
	public static void main(String args[])
	{
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int no1=sobj.nextInt();
	
	System.out.println("Enter the second number");
	int no2=sobj.nextInt();
	
	System.out.println("Enter the Choice");
	int choice=sobj.nextInt();
	
	switch(choice)
	{
		case 1:
			int add;
			add=no1+no2;
			System.out.println("Addition is"+add);
			break;
			
		case 2:
			int subtract;
			subtract=no1-no2;
			System.out.println("subtionract is"+subtract);
			break;

		case 3:
			int mult;
			mult=no1*no2;
			System.out.println("multiplication is"+mult);
			break;

		case 4:
			int division;
			division=no1/no2;
			System.out.println("division is"+division);
			break;	

		case 5:
			
			System.exit(0);
				
	}
	
	
	}
	
}