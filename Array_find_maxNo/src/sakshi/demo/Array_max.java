package sakshi.demo;

import java.util.Scanner;

public class Array_max {

	public static void main(String[] args) {
		int a[]	= new int[5];
		int max=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array element");
		
		for(int i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array element");
		
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+"");
		}
		
		max = a[0];
		System.out.println("Maximum no. in array : ");
		
		for(int i=0; i<5; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Max ele: " +max);
		
		
	}

	}














