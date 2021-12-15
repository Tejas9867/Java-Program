/*  Pattern-5
 * * * * *
   * * * *
     * * *
       * *
         *
 */


package test;

public class Pattern5 
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for (int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new Pattern5().meth1();
		
	}
	

}
