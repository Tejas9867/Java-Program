/*
  Pattern -2
 *****
 ****
 ***
 **
 *			
 			*/

package test;

public class Pattern2
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
			new Pattern2().meth1();
	}

}
