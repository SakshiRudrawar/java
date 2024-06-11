package default_paramteric;

public class Demo {
	
	int a , b;
	
	Demo()
	{
		a=10;
		b=20;
		System.out.println("\n default constructor");
	}
	
	Demo(int a , int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("\n parameterized constructor");
	}
	
	void display()
	{
		System.out.println("\n a=" +a+ "  " + "b=" + b);
	}

}
