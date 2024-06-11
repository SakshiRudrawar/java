package sakshi.min;

import java.util.*;

public class Array_min {

	public static void main(String[] args) {

		int a[]	= new int[5];
		int min=0;
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
		
		min = a[0];
		System.out.println("Minimum no. in array : ");
		
		for(int i=0; i<5; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Min ele: " +min);
		
		
	}

}












