/*
 Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16
*/

import java.util.*;
class DivideNumbers
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int no1=sobj.nextInt();
		
		System.out.println("Enter the second number");
		int no2=sobj.nextInt();
		
		int div=no1/no2;
		System.out.println("Division is"+div);
	}
}