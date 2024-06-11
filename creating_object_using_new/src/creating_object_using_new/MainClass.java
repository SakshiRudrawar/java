package creating_object_using_new;

public class MainClass {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		
		Demo d2 = new Demo();
		System.out.println(d2.hashCode());
		
		d1.display();
		d2.display();
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		
		
		
		

	}

}
