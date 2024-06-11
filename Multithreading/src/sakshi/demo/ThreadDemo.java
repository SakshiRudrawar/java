package sakshi.demo;
import java.util.*;
public class ThreadDemo { // implements Runnable
	
	public static void main(String args[])
	{
		Runnable r1 = new Thread(new UIThread());
		Thread t1 = new Thread(new UIThread());
		Thread t2 = new  Thread(new RemoteThread());
		
		t1.setName("UIThread");
		t2.setName("RemoteThread");
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try 
		{
			t2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		p5();
	    System.out.println(Thread.currentThread().getName());
	}
	
	
		
      public static void p5()
      {
    	  System.out.println("process p5");
      }

	}	
		











