package sakshi.demo;

public class Demo {
	
	public Demo() 
	{
		this (50);
		System.out.println("Default constructor");
	}
	
	
	public Demo(int a) 
	{
		System.out.println("parameterized constructor");
	}
	
	int a=10, b=20;
	
	void display()
	{
		System.out.println("a="+this.a + "b=" +this.b);
		System.out.println(this);
	}

}
