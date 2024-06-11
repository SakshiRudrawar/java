package sakshi.equals;

import java.util.Arrays;
import java.util.Scanner;

public class Array_equals 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int b[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Array elements :");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();			
		}
		
		System.out.println("Enter the 2nd Array elements :");
		for(int i=0; i<5; i++)
		{
			b[i]=sc.nextInt();			
		}
		
		boolean c = Arrays.equals(a,b);
		
		System.out.println("Both array are equal: " +c);	
		
		

	}

}
