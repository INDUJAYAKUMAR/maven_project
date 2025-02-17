package constructor;

// Program to find the reverse of a number
// a. Two constructors, one for calculation reverse and other for display
// b. Argument variable and instance variable should be the same
// c. Main method allows invoking only one constructor

public class Reverse_Number {
    int rev; 
    
    // Constructor for calculation of the reverse
    public Reverse_Number( int num) {
        rev = 0; 
        
        while (num != 0) {
            int digit = num % 10; 
            rev = rev * 10 + digit; 
            num = num / 10; 
        }
    }

    // Constructor for displaying the reversed number
    public Reverse_Number() {
        System.out.println("The reverse number is: " + rev);
    }

    // Main method to invoke the constructor
    public static void main(String[] args) {
        Reverse_Number newobj = new Reverse_Number(1234); // Invokes the reverse calculation constructor
        Reverse_Number obj = new Reverse_Number(); // Invokes the display constructor
    }
}
