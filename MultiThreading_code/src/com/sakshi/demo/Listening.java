package com.sakshi.demo;

public class Listening extends Thread
{
	public void musicListening()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("music listening processing");
		}
	}
	
	public void run()
	{
		musicListening();
	}

}
