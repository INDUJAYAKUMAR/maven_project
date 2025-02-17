package multipleinheritance_interface;

public class Childclass implements Parentinterface1, Parentinterface2{

	public static void main(String[] args) {
		Childclass obj = new Childclass();
		obj.parentmethod1();
		obj.parentmethod2();
		
		//Parentinterface1 obj1 = new Childclass();
		//obj1.parentmethod1();

	}

	@Override
	public void parentmethod2() {
		System.out.println("Parent interface 2");
	}

	@Override
	public void parentmethod1() {
		System.out.println("Parent interface 1");
		
		
	}

}
