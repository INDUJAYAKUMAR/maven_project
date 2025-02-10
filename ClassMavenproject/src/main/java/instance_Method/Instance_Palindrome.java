package instance_Method;
import java.util.Scanner;

public class Instance_Palindrome {
    
    int originalnum, revnum; 
    
    
    public void pali() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        originalnum = a; 
        revnum = 0; 

        
        while(a != 0) {
            int digit = a % 10; 
            revnum = revnum * 10 + digit; 
            a = a / 10; 
        }
    }
    
    
    public void palicheck() 
    {
        if(originalnum == revnum)
        {
            System.out.println("The value is a palindrome");
        } 
        else 
        {
            System.out.println("The value is not palindrome");
        }
    }

    public static void main(String[] args) {
        Instance_Palindrome obj = new Instance_Palindrome();
        obj.pali(); 
        obj.palicheck(); 
    }
}
