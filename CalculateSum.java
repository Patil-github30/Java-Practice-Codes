/*2. Write a Java program to print the sum of two numbers. Go to the editor
Test Data:
74 + 36
Expected Output :
110*/

import java.io.*;
 class CalculateSum
 {
	 public static void main(String args[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 
		 System.out.println("Enter first no");
		 int no1=sobj.nextInt();
		 
		 System.out.println("Enter second no");
		 int no2=sobj.nextInt();
		 
		 int sum=no1+no2;
		 System.out.println("Addition is"+sum);
	 }
 }