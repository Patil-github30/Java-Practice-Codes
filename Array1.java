import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int odd=0;
		int even=0;

		System.out.println("Enter the no of elements");
		int n=sc.nextInt();

		int arr[]=new int[n];
		
		System.out.println("Enter the elements in array one by one");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array are:");
		for(int i=0;i<=n;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i=0;i<n;i++)
		{
		if((arr[n]%2)==0)
		{
			even++;
			System.out.println("Even elements are:"+even);
		}
		else
		{
			odd++;
			System.out.println("Odd elements are:"+odd);
		}
		}
	}
}