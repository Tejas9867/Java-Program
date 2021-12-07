package com.pack1;

public class Addamount
{
	int amount=500;
	
	Addamount()
	{
		System.out.println("Without Deposit "+amount);
	}
	Addamount(int a)
	{
		amount=amount+a;
		System.out.println("After adding Deposite "+amount);
	}
	public static void main(String[] args)
	{
			new Addamount(100);
			new Addamount();
	}
}
