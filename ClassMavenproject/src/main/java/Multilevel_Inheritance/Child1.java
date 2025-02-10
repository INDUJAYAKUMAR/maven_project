package Multilevel_Inheritance;

public class Child1 extends Parent1{
	public void flowers()
	{
		System.out.println("This is the child1 class");
	}
	public static void main (String args[]) {
	Child1 obj1 = new Child1();
	obj1.name1();
	obj1.flowers();
	}

}
