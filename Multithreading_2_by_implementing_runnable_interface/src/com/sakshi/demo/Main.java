package com.sakshi.demo;

public class Main {

	public static void main(String[] args) 
	{
		Demo d = new Demo();
		
		Thread t = new Thread(d);  // start method thread class ka hai so class ka object pass karenge to access method of thread in runnable
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread");
		}
		
		

	}

}
