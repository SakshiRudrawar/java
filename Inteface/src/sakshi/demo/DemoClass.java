package sakshi.demo;

public class DemoClass implements Demo1 , Demo2{
	
	public void m1()
	{
		System.out.println("m1 method of demo class");
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 method of demo class");	
	}

}
