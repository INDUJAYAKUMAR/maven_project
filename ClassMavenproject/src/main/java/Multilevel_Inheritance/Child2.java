package Multilevel_Inheritance;

public class Child2 extends Child1{
	public void methodname()
	{
		System.out.println("This is the method of child 2");
	}

	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		obj.name1();
		obj.flowers();
		obj.methodname();
	}
	public Child2() {
		System.out.println("This is the constructor of child 2");
	}

}
