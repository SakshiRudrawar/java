package sakshi.copyof;

import java.util.Arrays;
import java.util.Scanner;

public class My_copyof 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  Array elements :");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();			
		}
		
		System.out.println(" Array elements :");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+"");		
		}
		
		
		int b[] = Arrays.copyOf(a,5);
		
		System.out.println("Copied array form first");
		
		for(int i=0; i<5; i++)
		{
			System.out.println(b[i]+"");
		}
		

	}

}














