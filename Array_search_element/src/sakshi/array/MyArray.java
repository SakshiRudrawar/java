package sakshi.array;

import java.util.*;

public class MyArray {

	public static void main(String[] args) 
	{
		
		int a[] = new int[5];
		int n ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array elements :");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();			
		}
		
		System.out.println(" Array elements :");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+"");		
		}
		
		System.out.println(" Enter the element you want to search :");
		n=sc.nextInt();
		
		boolean found = false;
        for (int i = 0; i < 5; i++) 
        {
            if (a[i] == n) 
            {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
		
		
		
	
	}

}
