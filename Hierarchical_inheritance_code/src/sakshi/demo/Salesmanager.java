package sakshi.demo;

public class Salesmanager extends Employee{
	
	double incentive=10000;
	
	double CalIncentive()
	{
		System.out.println("incentive of salesmanger :" +incentive);
		return incentive;
	}
	
	double SmSalary()
	{
		return salary+incentive;
	}
	


}
