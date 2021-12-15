/* Pattern-3
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 */

package test;

public class Pattern3 
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new Pattern3().meth1();
		
	}
	

}
