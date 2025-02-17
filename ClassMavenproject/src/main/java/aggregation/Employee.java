package aggregation;

public class Employee {
	
	int ID;
	String Name;
	
	Address obj ; //create parent class object
	
	public Employee(int iD, String name, Address obj) {
		super();
		ID = iD;
		Name = name;
		this.obj = obj;
	}
	
	public void display()//instance method
	{
		System.out.println("ID: "+ID);
		System.out.println("Name: "+ Name);
		System.out.println("Housename: "+obj.Housename);
		System.out.println("City: "+obj.City);
		System.out.println("State: "+obj.State);
		System.out.println("Pincode: "+obj.Pincode);
	}
	public static void main(String[] args) {
		
		Address newadd = new Address("Nandanam","TVM","Kerala",679034); 
		Employee newemp =new Employee(34,"Rose",newadd);
		
		newemp.display();// call instance method
		
	}

}
