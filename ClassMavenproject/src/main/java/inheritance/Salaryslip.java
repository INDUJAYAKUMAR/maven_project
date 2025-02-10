//•	Class 3
//Find the total salary (basic pay + hra – pf – deduction + bonus) 
//And get the salary slip
//Salary slip should contains : Basic pay, Deduction, hra, pf, bonus 
//& total salary by hand


package inheritance;

public class Salaryslip extends Calculation_HRA_PF {
	double total;
	public void total_salary()
	{
		 total = basic+hra-pf-deduct+bonus;
		System.out.println("Basic pay: "+basic);
		System.out.println("Deduction: "+deduct);
		System.out.println("HRA : "+hra);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total salary in hand : "+total);
				
	}

	public static void main(String[] args) {
		
		Salaryslip final1= new Salaryslip();
		final1.info();
		final1.calculation();
		final1.total_salary();
	}

}
