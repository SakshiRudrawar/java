package com.sakshi.demo;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("program started");
		
		String s1 = null;
		
		//or for exception not occured
		//String s1 = "india";
		try
		{
			int a =s1.length();
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("finally block executed");
			
		}
		System.out.println("program ended");
		
	}

}
