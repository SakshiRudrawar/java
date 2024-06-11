package sakshi.demo;

public class UIThread implements Runnable {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		p1();
		p3();
		
	}
	
	public void p1()
	{
		System.out.println("process 1");
	}
	
	
	
	public void p3()
	{
		System.out.println("process 3");
	}

}
