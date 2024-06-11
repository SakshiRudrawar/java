package sakshi.demo;

public class RemoteThread implements Runnable{
	

	@Override
	public void run() {
		// TODO Auto-generated method stub

		p2();
		p4();
	}

	public void p2()
	{
		System.out.println("process 2");
	}
	
	public void p4()
	{
		System.out.println("process 4");
	}
	
}
