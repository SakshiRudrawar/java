package sakshi.demo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		try
		{
			int a[] = new int[-1];
		}
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("program ended");
		
		

	}

}
