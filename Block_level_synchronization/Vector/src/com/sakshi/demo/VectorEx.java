package com.sakshi.demo;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>(4); // default size  is 10
		
		list.add("mango"); // indexing start from 1
		list.add("banana");
		list.add("melon");
		list.add("orange");
		
		
		System.out.println(list);
		System.out.println("capacity of vector :" +list.capacity());
		
		list.add("watermelon");
		// becoz we are passing size is 4 when we add 5th ele then size will be 8 =4*2 // duppat hoel
		System.out.println("capacity after adding 5 th ele :" +list.capacity());
		

		
		
		
		
		
		
		

	}

}
