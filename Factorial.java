package test;
import java.util.*;
public class Factorial
{
	Scanner sc=new Scanner(System.in);
	
	public void display()
	{
		int fact=1;
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	public static void main(String[] args)
	{
		Factorial obj=new Factorial();
		obj.display();
	}
}
