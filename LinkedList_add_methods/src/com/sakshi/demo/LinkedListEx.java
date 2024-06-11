package com.sakshi.demo;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String args[])
	{
		
		System.out.println("first list");
		System.out.println("-------------------------------------");
		
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("sakshi");
		al.add("ketaki");
		al.add("sachin");
		al.add("rahul");
		al.add("yogini");
		al.add("suraj");
		
		
		Iterator<String> itr = al.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("-------------------------------------");
		System.out.println("Adding a element on specific position");
		
		al.add(4 , "Akash");
		
		System.out.println(al);
		System.out.println("-------------------------------------");
		
		
		// creating a second list
		
		System.out.println("second list");
		System.out.println("-------------------------------------");
		
		LinkedList<String> bl = new LinkedList<String>();
		
		bl.add("prajakta");
		bl.add("pranita");
		
		System.out.println(bl);
		System.out.println("-------------------------------------");
		
		System.out.println("adding second list ele to first list");
		
		al.addAll(bl);
		
		System.out.println(al);
		System.out.println("-------------------------------------");
		
		System.out.println("adding second list ele to first list at specific position");
		
		al.addAll(1, bl);
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		
		System.out.println("adding element at first");
		
		al.addFirst("HK");
		System.out.println(al);
		

		System.out.println("-------------------------------------");
		
		System.out.println("adding element at last");
		
		al.addLast("krishna");
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		

		System.out.println("Traversing the list ele in reverse order");
		
		
		Iterator<String> itr1 = al.descendingIterator();
		
		while(itr1.hasNext())
		{

			System.out.println(itr1.next());
		}
		

		System.out.println("-------------------------------------");
		System.out.println("removing element");
		
		al.remove("suraj");
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		System.out.println("removing element on basis of position");
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		System.out.println("removing element on basis of position");
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		System.out.println("removing 1st ele");
		
		al.removeFirst();
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		System.out.println("removing last ele");
		
		al.removeLast();
		System.out.println(al);
		
		System.out.println("-------------------------------------");
		System.out.println("removing first occurrence ele");
		
		al.removeFirstOccurrence("rahul");
		System.out.println(al);
		
		
		System.out.println("-------------------------------------");
		System.out.println("removing last occurrence ele");
		
		al.removeLastOccurrence("Akash");
		System.out.println(al);
		
		
		System.out.println("-------------------------------------");
		System.out.println("removing all the ele in the list");
		
		al.clear();
		System.out.println(al);
		
		
		
		
		
		
		
		
		
	     
		
		
		
		
		
		
	}

}















