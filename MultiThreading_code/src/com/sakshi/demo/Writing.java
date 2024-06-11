package com.sakshi.demo;

public class Writing extends Thread
{
	public void bookWriting()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("book writing processing");
		}
	}
	
	public void run()
	{
		bookWriting();
	}
	
}
