//Write a program to find the factorial of a number Output – “Factorial of <given number> is <result>.

package static_method;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
    	
    	System.out.println("Enter the number: ");
    	
         Factorial.factorial_Number();
    }

    public static int factorial_Number() {
        int j = 1;  
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {  
            j *= i;  
        }
        System.out.println("The factorial of "+ a + " is "+j);
        return j;  
    }
}
