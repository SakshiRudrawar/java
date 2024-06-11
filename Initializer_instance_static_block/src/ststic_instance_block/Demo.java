package ststic_instance_block;

public class Demo {
	
	int a , b;
	
	Demo()
	{
		a=10;
		b=20;
		System.out.println("\n default constructor call");
	}
	
//	Demo(int a , int b)
//	{
//		this.a=a;
//		this.b=b;
//		System.out.println("\n paramerterized constructor call");
//	}
	
	{
		System.out.println("\n instances block called"); // instance block called before constructor
	}
	
	static
	{
		System.out.println("\n static block called"); // static block is called before constructor and instance block. 
	}
	
	
	void display()
	{
		System.out.println("a=" +a+ " "+"b="+b);
	}

}
