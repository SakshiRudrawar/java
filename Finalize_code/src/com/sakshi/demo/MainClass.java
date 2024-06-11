package com.sakshi.demo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		MainClass m = new MainClass();
		
		m = new MainClass(); // unrefferensable object
		
		System.gc(); // use garbage collector explicitly
		
		System.out.println("program ended");
		
	}
	
	protected void finalize()
	{
		System.out.println("finalize method call");

	}

}
