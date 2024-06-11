package com.sakshi.demo;

public class Table 
{
	void printTable(int n)
	{
		synchronized(this) // synchronized block
		{
			for(int i=1; i<=10;i++)
			{
				System.out.println(n*i);
			}
			
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
