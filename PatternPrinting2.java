/*
Pattern 
123456
*/



import java.util.*;

class PatternPrinting2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		for(int i=0;i<no;i++)
		{
			System.out.println(i);
		}
	}
}