package sakshi.demo;

public class HondaCar implements Car {
	
	int minSpeed=30;
	
	public void type()
	{
		System.out.println("hondacar available in hatchback sedan");
	}
	
	public void color()
	{
		System.out.println("hondacar is available in all color");
	}
	
	public void cc()
	{
		System.out.println("hondacar minSpeed :- " +minSpeed+ " "+ "maxspeed :- =" +maxSpeed);
	}

}
