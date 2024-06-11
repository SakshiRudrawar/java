package sakshi.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salesmanager sm = new Salesmanager();
		
		sm.Totalsalary();
		sm.CalIncentive();
		System.out.println("Total salary of salesmanger is : " + sm.SmSalary());
		
		System.out.println("-------------------------------------------------");
		
		Admin an = new Admin();
		an.Totalsalary();
		an.CalAllowance();
		System.out.println("Total salary of admin is : " + an.AmSalary());

	}

}
