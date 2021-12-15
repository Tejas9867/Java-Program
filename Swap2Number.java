//Wap Swap two Numbers using Third Variable

package test;

public class Swap2Number 
{
	int a=10,b=20;
	int temp;
	public void display()
	{
		temp=a;
		a=b;
		b=temp;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	public static void main(String[] args)
	{
		Swap2Number obj=new Swap2Number();
		obj.display();
	}

}
