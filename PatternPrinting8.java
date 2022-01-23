import java.util.*;

class PatternPrinting8
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter no of Rows");
		int iRows=sobj.nextInt();
		
		System.out.println("Enter no of Columns");
		int iCols=sobj.nextInt();
		
		Pattern8 pobj=new Pattern8(iRows,iCols);
		pobj.display();
	}
}

class Pattern8(iRows,iCols)
{
	public void display()
	{
	int i=0;
	int j=0;
	
	for(i=1;i<=iRows;i++)
	{
		for(j=1;j<=iCols;j++)
		{
			if((i%2)=0)
			{
				System.out.println("*");
			}
			else
			{
				System.out.println(j);
			}
		}
	}
	}
}


/*
import java.util.*;

class PatternPrinting8
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("inside main");
		
		Demo dobj=new Demo();
		{
			dobj.display();
		}
	}
}

class Demo
{
	public void display()
	{
		System.out.println("inside display");
	}
}
*/