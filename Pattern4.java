/* Pattern-4
     *
    **
   *** 
  ****
 *****
 */


package test;

public class Pattern4
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) 
	{
		new Pattern4().meth1();	
	}

}
