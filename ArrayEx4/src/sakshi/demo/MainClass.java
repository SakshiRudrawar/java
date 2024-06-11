package sakshi.demo;

public class MainClass 
{
	public static void main(String args[])
		{
		
		    int a[] = {10, 20, 30, 40, 50};
		    
		    //for(int i=0; i<a.length-1; i++)
		    for(int i=a.length-2; i>=0; i--)
		    {
		    	
      	    	int temp = a[i+1];
		    	a[i+1]=a[i];
		    	a[i] =temp;
		    	// i++; // add this line to swap every number
		    	
		    	
		    	// without using temp swap 1st number in array
		    	
//		    	a[i] += a[i+1];  // 10+20 = 30
//		    	a[i+1] = a[i]- a[i+1]; // 30-20 = 10  // 20 ka 10 hogaya
//		    	a[i] -= a[i+1]; // 30-10 = 20 // 10 ka 20 hogaya
//		    	
		    }
		    

		    for(int i=0; i<a.length; i++)
		    {
		    	System.out.print(a[i]+" ");
		    }
		    
		
		
		}

}
