package com.sakshi.demo;

public class Reading extends Thread
{
	public void bookReading()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("book reading processing");
		}
	}
	
	public void run()
	{
		bookReading();
	}

}
