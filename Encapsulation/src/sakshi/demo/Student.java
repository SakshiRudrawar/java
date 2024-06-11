package sakshi.demo;

public class Student {
	
	
	// variables are private
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
	
	// setter methods
	public void setsid(int sid)
	{
		this.sid = sid;
	}
	
	public void setsname(String sname)
	{
		this.sname = sname;
	}
	
	public void setscity(String scity)
	{
		this.scity = scity;
	}
	
	public void setspercentage(double spercentage)
	{
		this.spercentage = spercentage;
	}
	
	
	// getter methods
	
	public int getsid()
	{
		return sid;
	}
	
	public String getsname()
	{
		return sname;
	}
	
	public String getscity()
	{
		return scity;
	}
	
	public double getspercentage()
	{
		return spercentage;
	}
	
	
	// default constructor
	
	public Student()
	{
		
	}
	
	// parameterized constructor
	public Student(int sid, String sname, String scity , double spercentage)
	{
		this.sid=sid;
		this.sname=sname;
		this.scity=scity;
		this.spercentage=spercentage;
		
	}
	
	//override toString method
	public String toString()
	{
		return ("sid=" +sid + "sanme="+sname+ "scity=" +scity + "spercentage="+spercentage );
		
	}

}




















