package sakshi.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MernStackCourse ms = new MernStackCourse();  // first display becoz we call first
		ms.mernDisplay();
	
		System.out.println("---------------------------------");
		
		PythonCourse pc = new PythonCourse ();
		pc.pythonDisplay();
		
		System.out.println("---------------------------------");
		
		JavaCourse jc = new JavaCourse();
		jc.javaDisplay();
		

	}

}
