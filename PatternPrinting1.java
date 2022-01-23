import java.util.*;

class PatternPrinting1
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sobj.nextInt();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("*");
		}
			for(int j=0;j<=i;j++)
			{
				System.out.println("*");
			}
	}
}
