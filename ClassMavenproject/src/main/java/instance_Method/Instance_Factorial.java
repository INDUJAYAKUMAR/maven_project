//Write a program to find the factorial of a number(instance method)
//Output – “Factorial of <given number> is <result>.


package instance_Method;

public class Instance_Factorial {
	
	public void factorial(int num)
	{
		int j = 1;
		for(int i=1 ; i<=num ; i++)
		{
			j*= i;
			
		}
		System.out.println("Factorial of "+num+ " is "+j);
	}
	public static void main(String[] args) {
		Instance_Factorial obj = new Instance_Factorial();
		obj.factorial(7);
 
	}

}
