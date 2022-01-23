import java.io.*;
class ConstructorDemo
{
	String name;
	int rno;
	
	/*ConstructorDemo()
	{
		name="Ruchira";
		rno=10;
	}*/
	
	ConstructorDemo(String sname,int srno)
	{
		name=sname;
		rno=srno;
	}
	public static void main(String args[])
	{
		//ConstructorDemo cdobj1=new ConstructorDemo();
		ConstructorDemo cdobj2=new ConstructorDemo("Riya",88);
		//System.out.println(cdobj1.name);
		//System.out.println(cdobj1.rno);
		
		System.out.println(cdobj2.name);
		System.out.println(cdobj2.rno);
	}
}