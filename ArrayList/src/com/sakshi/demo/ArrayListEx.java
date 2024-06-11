package com.sakshi.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(); // creating arraylist
		
		list.add("mango"); // adding object in arraylist
		list.add("banana");	
		list.add("apple");	
		list.add("orange");	
		list.add("melon");
		
		// 1ST WAY using sop
		
		System.out.println(list); // printing list
		
		
		// 2ND WAY using iterating Arraylist using iterator
		
		ArrayList<String> name = new ArrayList<String>(); // creating arraylist
		
		name.add("tomato"); // adding object in arraylist
		name.add("potato");	
		name.add("flower");	
		name.add("onion");	
		name.add("capsicum");
		
		// traversing through iterator
		
		Iterator<String> itr = name.iterator(); // corrected the Iterator declaration
		
		while(itr.hasNext()) // check if iterator has the element
		{
			System.out.println(itr.next()); // printing the element and move to next
		}
		
		
		
		// 3RD WAY --  iterating arraylist using for each
		
		
		ArrayList<String> subject = new ArrayList<String>();
		
		subject.add("c"); 
		subject.add("cpp"); 
		subject.add("dsa"); 
		subject.add("sql"); 
		subject.add("java"); 
		
		// traversing list through for-each loop
		
		for(String subjectTopic:subject)
			System.out.println(subject);
			
		
		



	}

}



















