//Write a program to check whether the candidate is eligible for Voting(Use static method and boolean return type).

package static_method;
import java.util.Scanner;
public class Voting_Static_Method {
	public static boolean voting()
	{
		
		Scanner a = new Scanner(System.in);
		int age = a.nextInt();;
		if(age>=18)
		{
			System.out.println("The candidate is eligible for voting.");
			return true;
		}
		else
		{
			System.out.println("The candidate is not eligible for voting.");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the age of the candidate: ");
		Voting_Static_Method.voting();
	}

}
