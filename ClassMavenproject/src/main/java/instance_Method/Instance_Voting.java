
//Write a program to check whether the candidate is eligible for Voting(Use instance method and boolean return type)

package instance_Method;

import java.util.Scanner;
public class Instance_Voting {

	public boolean vote()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if(age>=18)
		{
		 System.out.println("Is eligible for voting ");
		 return true;
		}
		else
		{
	    System.out.println("Is not eligible for voting ");
		return false;
		}
	}
	public static void main(String[] args) {
		
		Instance_Voting obj = new Instance_Voting();
		obj.vote();
	}

}
