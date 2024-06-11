package constructor;

public class Demo {
	
	int a , b;
	int c;
	
	Demo()
	{
		a=10;
		b=20;
		c=100;
		System.out.println("constructor called");
	}
	
	void display()
	{
		System.out.println("a="+a+ "b="+b+"c="+c);
	}

}
