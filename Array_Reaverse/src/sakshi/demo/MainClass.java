package sakshi.demo;

import java.util.*;
public class MainClass 
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
	
		System.out.println(" enter the elements in array");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("array elemnts : ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");	
		}
		
		
		System.out.println(" array reverse elements : ");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]+" ");	
		}
	
    }
	
	

}





























