package shraddha.demo;

public class B extends Single
{
	char ch='z';
	
	public void Display()
	{
		System.out.println("showing details of b");
		System.out.println(ch);
	}


	public static void main(String[] args) 
	{
		Single s1=new Single();
		System.out.println(s1.a);
		s1.Displaye();

		B b1=new B();
		System.out.println(b1.ch);
		b1.Display();
		b1.Displaye();
	
	}
}


	

	
 


