package pack3;

import pack1.Class1;

public class Class4 extends Class1
{
	public void m4()
	{
		System.out.println("iam m4 from class4");
	}

	public Class4(int a, int b)
	{
		super(a, b);
	}

	public static void main(String[] args) 
	{
		
		Class4 c4 = new Class4(10, 20);
		c4.add();
		c4.sub();
		c4.m4();
		
		
	}

}
