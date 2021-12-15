// WAP to swap two Number without using Third vairabe

package test;

public class SwapNumber 
{
	public void display()
	{
		int a=10;
		int b=30;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	public static void main(String[] args)
	{
		SwapNumber obj=new SwapNumber();
		obj.display();
	}

}
