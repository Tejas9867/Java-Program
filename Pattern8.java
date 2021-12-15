/*Pattern-8
   *
  ***
 *****
*******

*/
package test;

public class Pattern8 
{
	void meth1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new Pattern8().meth1();
		
	}

}
