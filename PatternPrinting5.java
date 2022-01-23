/*
Pattern-

1*2#3*4#5*6#
*/

import java.util.*;
class PatternPrinting5
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the no");
		int no=sobj.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			if((i%2)==0)
			{
				System.out.println(i);
				System.out.println("#");
			}
			else
			{
				System.out.println(i);
				System.out.println("*");
			}
		}
	}
}