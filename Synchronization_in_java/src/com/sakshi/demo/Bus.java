package com.sakshi.demo;

public class Bus implements Runnable
{
	int available =1 , passenger;

	Bus(int passenger)
	{
		this.passenger=passenger;
	}

	@Override
	public synchronized void run() 
	{
		String name = Thread.currentThread().getName();
		
		if(available >= passenger)
		{
			System.out.println(name+ " "+  "reserved the seat..!");
			available=available-passenger;
		}
		else
		{
			System.out.println("Sorry seat is not available");
		}	
	}
	

}
