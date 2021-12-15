//WAP to Print Multiplication Table

package test;
import java.util.*;
public class MultplicationTable 
{
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		System.out.println("Enter Table number: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		MultplicationTable obj=new MultplicationTable();
		obj.display();
	}

}
