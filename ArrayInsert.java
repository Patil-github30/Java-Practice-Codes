import java.util.*;

class ArrayInsert
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of elements in array");
		int count=sc.nextInt();

		int arr[]=new int[count];

		System.out.println("Enter the elements in array");
		for(int i=0;i<count;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		System.out.println("Array elements are");
		for(int i=0;i<count;i++)
		{
			System.out.println("elements are:"+arr[i]);
		}	
	
		System.out.println("enter an number:");	
		int num=sc.nextInt();
		for(int i=0;i<count;i++){
		if(num==arr[i])
		{
			System.out.println("number is present");
		}
		else
		{
			System.out.println("number is not present");
		}}
	}
}