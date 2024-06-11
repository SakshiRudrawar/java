package multilevel_inheritance_code;

public class ElectricBike extends MotorBike{
	
	void displayFeatures()
	{
		super.displayFeatures();
		System.out.println("New features by electricbike : Electric motor and battery");
	}


}
