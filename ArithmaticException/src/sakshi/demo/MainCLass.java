package sakshi.demo;

public class MainCLass {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		int a=10;
		int b=0;
		int c = 0;
		
		try
		{
			c= a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		
		System.out.println(c);
		System.out.println("program ended");
		

	}

}
