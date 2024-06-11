package sakshi.array;

public class TestArray 
{
	public static void main(String args[])
	{  
		int a[] = new int[5]; // declartaion and installation
		
		// int a[]={10, 20, 30, 40};  another way to 
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
	
	  // traversing array
		for(int i=0 ; i<a.length; i++) // length is a property of array
		{
			System.out.println(a[i]);	
		}
		
	}

	
}
