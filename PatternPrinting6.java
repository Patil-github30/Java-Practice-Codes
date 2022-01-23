/*
Pattern-

12345654321
*/

import java.util.*;

class PatternPrinting6
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int no=sobj.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			System.out.println(i);
		}
		for(int i=(no-1);i>=1;i--)
		{
			System.out.println(i);
		}
	}
}