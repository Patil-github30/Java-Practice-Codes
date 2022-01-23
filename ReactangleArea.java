/*
Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

import java.util.*;
class ReactangleArea
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle");
		int length=sobj.nextInt();
		
		System.out.println("Enter the width of rectangle");
		int width=sobj.nextInt();
		
		int perimeter=2*(length+width);
		System.out.println("Perimeter of rectangle is"+perimeter);
		
		int area=length*width;
		System.out.println("Area of rectangle is"+area);
	}
}