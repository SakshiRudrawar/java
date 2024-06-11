package com.sakshi.demo;

public class Customer {

	public static void main(String[] args) 
	{
		Bus r = new Bus(1);
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("ram");
		t2.setName("shyam");
		t1.setName("raju");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
