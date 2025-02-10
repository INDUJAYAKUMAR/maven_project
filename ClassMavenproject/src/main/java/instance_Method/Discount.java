
//Write a program to check whether the customer have discount (get 20% discount if total amount is
//greater than 5000) or not and get the final amount in main method. (instance method)
//Get prices of items using parameterized method
//Method 1 - Calculate total amount
//Method 2 - Check discount

package instance_Method;

public class Discount {
	 float sum;
	 
	 public void items(float a, int b ,float c)
	 {
		 sum = a+b+c;
		 System.out.println("The sum is: "+sum);
	 }
	 public void dis()
	 {
		if (sum>5000) {
			float newsum = sum *.20f;
			float newsum1 = sum - newsum;
			
			System.out.println("Customer is eligible for 20% discount and the final amount is :"+newsum1);
		}
		else {
			System.out.println("No discount for the customer");
		}
	 }
	public static void main(String[] args) {
		
		Discount obj = new Discount();
		obj.items(4500.5f, 800, 100.4f);
		obj.dis();
	}

}
