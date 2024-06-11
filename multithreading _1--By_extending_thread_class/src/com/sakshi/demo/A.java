package com.sakshi.demo;

public class A extends Thread
{
	@Override       // run is a override method of thread class
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread method 1");
				Thread.sleep(1000); // its a method of runnable interface
			}
		}
		catch(InterruptedException i)
		{
			
		}
		
	}

}
