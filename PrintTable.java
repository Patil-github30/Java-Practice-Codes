/*
Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

*/

import java.util.*;
class PrintTable
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the no for which you want to print table");
		int no=sobj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int imult=i*no;
			System.out.println("Table is"+imult);

		}
	}
}
