package hierarchical_inheritance;

public class Child1 extends Parent_Class{
	
	public void instance()
	{
		System.out.println("This is Child1 class");
	}
	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		obj1.instance();	
		obj1.print1();
	}
	
}
