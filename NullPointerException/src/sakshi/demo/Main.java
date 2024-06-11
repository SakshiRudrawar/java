package sakshi.demo;

public class Main {

	public static void main(String[] args) {

		System.out.println("program started");
		
		String s1= null;
		
		try
		{
			System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("program ended");
	}

}
