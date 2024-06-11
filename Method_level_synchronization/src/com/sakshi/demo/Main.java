package com.sakshi.demo;

public class Main {

	public static void main(String[] args) 
	{
		Table obj = new Table(); // obj = 1 lock  , ek hi lock hota hai obj ke pass one by one wo pass krta hai
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
		
		


	}

}
