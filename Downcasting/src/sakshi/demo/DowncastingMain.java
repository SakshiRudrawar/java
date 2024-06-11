package sakshi.demo;

public class DowncastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Parent p = new Child(); // upcasting
	p.name="shubham";
	
	// performing downcasting implicitly 
	//Child c = new Parent(); // it gives compile time error
	
	
	// performing downcasting explicitly
	
	Child c = (Child)p; 
	c.age=18;
	
	System.out.println(c.name);
	System.out.println(c.age);
	c.showMessage();
	
	

	}

}
