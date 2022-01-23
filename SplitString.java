import java.util.*;

class SplitString
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int i=0;
		//System.out.println("Enter the string");
		//String str1=sobj.nextLine();
		String str1="Hello,I am,,ruchira,patil,,no,,,";
		
		int no=0;
		String[] splitstr = str1.split(",",-1); 
		
        for (String string : splitstr) 
		no++;
            System.out.println(String.format("\" %s \"",string));
			System.out.println(no);		
	}
}