
package inheritance;
import java.util.Scanner;
public class Class_Getinfo 
	{
	public int basic;
	public int deduct;
	public int bonus;
	public void info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic pay: ");
		basic = sc.nextInt();
		System.out.println("Enter the deduction: ");
		 deduct = sc.nextInt();
		System.out.println("Enter the bonus: ");
	     bonus = sc.nextInt();
	}
	public static void main(String args[])
	{
		Class_Getinfo ob =new Class_Getinfo();
		ob.info();
		
	}
	
}
