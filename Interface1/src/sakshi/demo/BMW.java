package sakshi.demo;

public class BMW implements Car{
	

	int minSpeed=30;
	
	public void type()
	{
		System.out.println("BMW available in every BMW new launch");
	}
	
	public void color()
	{
		System.out.println("BMW is available in all color");
	}
	
	public void cc()
	{
		System.out.println("BMW minSpeed =" +minSpeed+ " " +  "maxspeed=" +maxSpeed);
	}

}
