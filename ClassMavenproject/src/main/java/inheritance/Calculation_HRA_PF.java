package inheritance;

public class Calculation_HRA_PF extends Class_Getinfo {
	double hra;
	double pf;
	public void calculation()
	{
			
		 hra = basic * 0.05;
		 pf = basic * 0.20;
		System.out.println("HRA is: "+hra);
		System.out.println("PF is: "+pf);
	}
	public static void main(String args[])
	{
		Calculation_HRA_PF obj1= new Calculation_HRA_PF();
		obj1.info();
		obj1.calculation();
	}
}
