package com.sakshi.demo;

public class Thread1 extends Thread
{
	Table t ; //create the reference of table here
	
	Thread1(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(5);
	}

}
