package sakshi.copy.array;

import java.util.*;

public class MainClass {
	
	public static void main (String args[])
	{
		int a[]= new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the elements ");
		
		for(int i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array elements : ");
		
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+" "); 
		}
		
		System.out.println("Copied array from first : ");
		
		for(int i=0; i<5; i++)
		{
			b[i]=a[i];
			System.out.println(b[i]+" "); 
		}	
			
		
		
	}

}
