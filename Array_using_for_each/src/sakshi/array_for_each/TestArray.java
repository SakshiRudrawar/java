package sakshi.array_for_each;

public class TestArray {

	public static void main(String args[])
	{
		int arr[] = {20, 20, 80, 67};
		
		// pointing array using for-each loop
		
		for(int i : arr)//for-each loop prints the array elements one by one.
		{                 //  It holds an array element in a variable, then executes the body of the loop
			System.out.println(i);
			
		}
		
	}

}
