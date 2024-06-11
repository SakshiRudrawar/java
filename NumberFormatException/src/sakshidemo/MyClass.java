package sakshidemo;

public class MyClass {

	public static void main(String args[])
	{
		System.out.println("program started");
		
		String s1 = "123t";
		int value=0;
		
		try
		{
			value = Integer.parseInt(s1);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(value);
		System.out.println("program ended");
		
	}
}
