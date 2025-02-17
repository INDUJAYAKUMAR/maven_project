package interfacepackage;

public class Child_Interface implements Interface_Eg{

	public static void main(String[] args) {
		Interface_Eg objint = new Child_Interface();
		objint.abstractmethod();
		objint.abstractmethod2();

	}

	@Override
	public void abstractmethod() {
		int a = 7;
		int b = 8;
		int sum = a+b;
		
		System.out.println("Sum is: "+sum);
		
	}

	@Override
	public void abstractmethod2() {
		String name = "Indu";
		System.out.println("My name is : "+name);
		System.out.println(z);
		
	}

}
