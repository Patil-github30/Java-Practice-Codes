import java.util.*;
class ArrayOperation
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int product=1;

		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The Sum of elements in array is:"+sum);


		for(int i=0;i<arr.length;i++)
		{
			product=product*arr[i];
		}
		System.out.println("The product of elements in array is:"+product);

	}
}