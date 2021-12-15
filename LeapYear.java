//WAP to check year is Leap Year or Not

package test;
import java.util.*;
public class LeapYear
{
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		if((year%400==0) ||(year%4==0 && year%100!=0))
		{
			System.out.println(year+" : is leap year");
		}
		else
		{
			System.out.println(year+" : is Not a leap year");
		}
	}
	public static void main(String [] args)
	{
		LeapYear obj=new LeapYear();
		obj.display();
	}
}
