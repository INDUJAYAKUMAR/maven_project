package aggregation;

public class Lineitem {
	int Quantity;
	
	Product pro; //creating parent class object
	
	 
	public Lineitem(int quantity, Product pro) { //constructor
		super();
		Quantity = quantity;
		this.pro = pro;
	}

	public void line() //instance method
	{
		System.out.println("ID: "+pro.ID);
		System.out.println("Name: "+pro.Name);
		System.out.println("Description: "+pro.Desc);
		System.out.println("Quantity: "+Quantity);
				
		
	}

	public static void main(String[] args) {
		Product prod1 = new Product(30,"Rose","New"); 
		Lineitem item =new Lineitem(4,prod1);
		item.line(); // calling instance method

	}

}
