package com.sakshi.demo;

public class Test {
	public static void main(String args[])
	{
		try
		{
			vote(12);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


public static void vote(int age) throws InvalidAgeException
{
	if(age<18)
	{
		throw new InvalidAgeException("not eligible for voting");
	}
	else
	{
		System.out.println("eligible for voting");
	}
	}
}



