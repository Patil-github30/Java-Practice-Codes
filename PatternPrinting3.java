/*
Pattern-
-3 * -2 * -1 * 0 * 1 * 2 * 3 *
*/

import java.util.*;

class PatternPrinting3
{
	public static void main(String args[])
		{
			Scanner sobj=new Scanner(System.in);
			
			System.out.println("Enter the number");
			int no=sobj.nextInt();
			
			for(int i=-no;i<=no;i++)
			{
				System.out.println(+i);
				System.out.println("*");
			}
		}
	}
