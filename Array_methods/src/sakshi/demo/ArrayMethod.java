package sakshi.demo;

import java.util.Arrays;

//array methods 

public class ArrayMethod 
{
	public static void main(String args[])
	{
		String a[] = {"learn", "coding", "keypoints", "education"};
		
		System.out.println("toString:" +Arrays.toString(a));
		
		System.out.println("asList:" +Arrays.asList(a));
		
		int arr[][] = {{10,20}, {30,40}};
		System.out.println("deepostring:" +Arrays.deepToString(arr));
		
		
		
	}


	

}
