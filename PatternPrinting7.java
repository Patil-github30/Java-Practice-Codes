/*

*/




import java.util.*;

class PatternPrinting7
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner("System.in");
		
		System.out.println("enter no");
		int no=sobj.nextInt();
		
		int iRow=0;
		int iCol=0;
		
		for(iRow=1;iRow<=no;iRow++)
		{
			for(iCol=1;iCol<=no;iCol++)
			{
				System.out.println(iCol);
			}
			System.out.println("\n");
		}
	}
}