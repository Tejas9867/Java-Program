package test;

public class Greater3Number
{
	int a=50,b=40,c=40;
	public void display()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" :A is greater number ");
			}
			else
			{
				System.out.println(c+" :C is greater Number ");
			}
		}
		else if(b>c)
		{
			System.out.println(b+" : b is greater number");
			
		}
		else
		{
			System.out.println(c+" : c is greater number");
		}
			
	}
	public static void main(String args[])
	{
		Greater3Number obj=new Greater3Number();
		obj.display();
	}

}
