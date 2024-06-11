package com.sakshi.demo;

public class Demo implements Runnable // we use implements becoz runnable is a interface
{

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("my child thread");
		}
		
	}
	

}
