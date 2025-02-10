package hierarchical_inheritance;

public class Child2 extends Parent_Class{
	public void Child2_instance()
	{
		System.out.println("This is child 2");
	}
	
	public static void main(String args[])
	{
	Child2 obj2 = new Child2();
	obj2.Child2_instance();
	obj2.print1();
	
}
}
