package sakshi.demo;

public class Admin extends Employee{
	
	double allowance = 20000;
	
	double CalAllowance()
	{
		System.out.println("allowance of admin  :" +allowance);
		return allowance;
	}
	
	double AmSalary()
	{
		return salary+allowance;
	}

}
