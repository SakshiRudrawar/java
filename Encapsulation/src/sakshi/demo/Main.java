package sakshi.demo;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		// one by one set 
		s.setsid(100);
		s.setsname("sakshi");
		s.setscity("pune");
		s.setspercentage(88.80);
		
		
		// one by one get
		
		System.out.println("Id=" +s.getsid());
		System.out.println("Name=" +s.getsname());
		System.out.println("City=" +s.getscity());
		System.out.println("Percentage=" +s.getspercentage());
		
		System.out.println("-------------------------------------");
		
		// to get multiple data at a time
		
		Student s1 = new Student(102 , "kalayani" , "mumbai", 90.00);
		System.out.println(s1);

	}

}
