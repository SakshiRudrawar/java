package sakshi.java;

//Java Program to demonstrate the way of passing an array  
//to method.  

// findout min number in array

public class TestArray {
	
	static void min(int arr[])
	{
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(min > arr[i])
				min=arr[i];
		}
		
		System.out.println(min);  
	
    }

	public static void main(String[] args) 
	{
		
		int a[]= {20, 30, 40 , 50}; //declaring and initializing an array
		min(a);//passing array to method  
	
	}

}








