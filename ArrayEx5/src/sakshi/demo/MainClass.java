package sakshi.demo;

import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		
		int size, i;
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size = r.nextInt();
		
		int a[] = new int[size]; 
		
		for(i=0; i<size; i++) // get elememts from user
		{  
			System.out.println("Enter the ele");
			a[i]= r.nextInt();		
	    }
		
		for(i=0; i<size; i++) // print the element
		{
		     System.out.print(a[i] + " ");	
	    }	
		
	}
}












