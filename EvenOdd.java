//WAP a Program to check number is Even Or Odd 

package test;
import java.util.*;
public class EvenOdd 
{
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" :Number is Even");
		}
		else
		{
			System.out.println(num+" :Number is Odd");
		}
	}
	public static void main(String[] args)
	{
		EvenOdd obj=new EvenOdd();
		obj.display();
	}

}
