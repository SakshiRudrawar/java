package com.sakshi.demo;

public class B {

	public static void main(String[] args) throws InterruptedException // 1st main class thread
	{
		A t = new A();
		t.start(); //  2nd thread
		
		for(int i=1;i<=5;i++) // main thread for loop
		{
			System.out.println("thread method 2");
			Thread.sleep(1000); // its a method of runnable interface
		}
		

	}

}
