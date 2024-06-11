
package string_buffer_class;

public class MainCLass {
	
	public static void main(String args[])
	{
		
		// stringBufferr class  :- append and reverse is a method of stringBuffer class
		
		StringBuffer sb = new StringBuffer("java_");
		System.out.println(sb);
		
		// method to append string
		sb.append("coding");
		System.out.println(sb);
		
		// method to reverse string 
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("______________________");
		
		// stringBuilder class  :- append and reverse is a method of stringBuilder class
		
		StringBuilder sbr = new StringBuilder("learn_");
		System.out.println(sbr);
		

		// method to append string
		sbr.append("java");
		System.out.println(sbr);
		
		// method to reverse string 
		sbr.reverse();
		System.out.println(sbr);
		
	}

}
