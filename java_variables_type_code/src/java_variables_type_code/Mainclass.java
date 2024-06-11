package java_variables_type_code;

public class Mainclass {
	
	public static void main(String args[])
	{
		Demo d1= new Demo();
		Demo d2=new Demo();
		
		d1.id=101;
		d1.ename= "sakshi";
		d1.depname="HR Department";
		
		System.out.println(d1.id);
		System.out.println(d1.ename);
		System.out.println(d1.depname);
		
		System.out.println("_________________");
		
		System.out.println(d2.id);
		System.out.println(d2.ename);
		System.out.println(d2.depname);
		
		System.out.println("_________________");
		d1.calsal();
		
		
		
		
		
	}

}
