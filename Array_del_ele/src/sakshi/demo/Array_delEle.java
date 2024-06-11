package sakshi.demo;

import java.util.*;

public class Array_delEle {

	public static void main(String[] args) 
	{
		int size, loc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array size");
		size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("enter the element");
		
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();	
		}
		
		System.out.println("enter the location");
		loc=sc.nextInt();
		
		for(int i=loc; i<size-1; i++)
		{
			a[i]=a[i+1];
		}
		size--;
		
		System.out.println("After deletion ");
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]+"");
		}
		
		
	}

}













