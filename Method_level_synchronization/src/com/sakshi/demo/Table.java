package com.sakshi.demo;

public class Table 
{
	public synchronized void printTable(int n) //t1 or t2  one by one ekek ko lock dega or synchronized ke wajah se at a time ek ko hi entry milegi 
	{											// jiske pass lock hai , kam hone ke baad wo lock ko release kar dega or dusre ko chance milega
		for(int i=1; i<=10; i++)
		{
			System.out.println(n*i);
		}
	}

}
