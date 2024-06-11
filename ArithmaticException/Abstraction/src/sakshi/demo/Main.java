package sakshi.demo;

public class Main {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();  // we cannot create the object of abstract class so follow this line
		s.draw();
		
		Rectangle r = new Rectangle(); // another way to create the object of sub class
		r.draw();
		
		Shape s1 = new Circle(); // 1st way
		s1.draw();
		
		Circle c = new Circle(); //2nd way
		c.draw();
	}

}
