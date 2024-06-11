package sakshi.sort;

import java.util.Scanner;
import java.util.Arrays;


public class Array_sort {

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array elements :");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();			
		}
		
		Arrays.sort(a); // without using sorting code use arrays method sort()  
		                 // it is a ststic method.
		
		System.out.println("Sorted array :");	
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+"");	
		}
		

	}



}
