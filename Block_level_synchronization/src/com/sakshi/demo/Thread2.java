package com.sakshi.demo;

public class Thread2 extends Thread
{
	Table t;
	
	Thread2(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(100);
	}

}
