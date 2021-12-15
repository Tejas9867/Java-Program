package test;

public class GreaterTwoNumber 
{
	int a=10;
	int b=20;
	public void display()
	{
		if(a>b)
		{
			System.out.println(a+" : A is greater number");
		}
		else
		{
			System.out.println(b+" : B is greater Number");
		}
	}
	public static void main(String args[])
	{
		GreaterTwoNumber obj=new GreaterTwoNumber();
		obj.display();
	}

}
