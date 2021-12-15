//WAP of Factorial using Recursion 
package test;
public class RecursionFactorial 
{
	int fact=1;
	
	int Factorial(int num)
	{ 
		if(num>1)
		{
		fact=fact*num;
		Factorial(num-1);
		
		}
		return fact;
	}
	public static void main(String[] args)
	{
		RecursionFactorial obj=new RecursionFactorial();
		int res=obj.Factorial(5);
		System.out.println(res);
	}

}
