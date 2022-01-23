/*
pattern-

1 * 3 * 5 * 7 *

*/


import java.util.*;
class PatternPrinting4
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter a no");
		int no=sobj.nextInt();
		
		if(no<0)
		{
			no=-no;
		}
		
		for(int i=1;i<=no;i++)
		{
			if((i%2)!=0)
			{
				System.out.println(i);
				System.out.println("*");
			}
		}
		
	}
}