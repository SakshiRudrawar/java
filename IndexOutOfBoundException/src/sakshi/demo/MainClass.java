package sakshi.demo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		int a[]= {10, 20, 30};
		
		try
		{
			System.out.println(a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			// instead of above line
		}
		
		System.out.println("program ended");
		
		

	}

}
