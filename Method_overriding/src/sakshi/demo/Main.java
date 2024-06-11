package sakshi.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI_Bank sb = new SBI_Bank();
		
		ICICI_bank ib = new  ICICI_bank();
		
		AXIS_bank ab = new AXIS_bank();
		
		System.out.println("SBI rate of intrest :" +sb.getRateOfIntest());
		System.out.println("ICICI rate of intrest :" +ib.getRateOfIntest());
		System.out.println("AXIS rate of intrest :" +ab.getRateOfIntest());
		
		
		
		 
		
	}

}
