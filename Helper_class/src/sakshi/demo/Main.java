package sakshi.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length = 5.0;
		double width = 3.0;
		
		// without creating an object of RectangleHelper class we use --- helper class method to call directly like below
		double Area = RectangleHelper.calArea(length , width);
		double Perimeter = RectangleHelper.calPerimeter(length, width);
		
		System.out.println("Area of Rectangle : " +Area);
		System.out.println("Perimeter of Rectangle : " +Perimeter);
		
		

	}

}
