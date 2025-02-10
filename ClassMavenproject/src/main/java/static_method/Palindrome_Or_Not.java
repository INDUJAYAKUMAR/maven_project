//Write a program to check whether the given number is Palindrome/Not.
//Method 1- to find the reverse(pass the number in argument)
//Method 2-to check palindrome/not


package static_method;
import java.util.Scanner;

public class Palindrome_Or_Not {

    public static void main(String[] args) {
        
        if (Pali()) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

    public static boolean Pali() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num; 
        int revnum = 0;
        
        
        while (num != 0) {
            int digit = num % 10; 
            revnum = revnum * 10 + digit; 
            num = num / 10; 
        }

        return originalNum == revnum;
    }
}
