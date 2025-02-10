package singleInheritance;

public class ClassB_Child extends ClassA_Parent  {
	public void inheritance()
	{
		System.out.println("Method of child");
	}
	public static void main(String[] args) {
		ClassB_Child obj = new ClassB_Child();
		obj.name();
		obj.inheritance();
	}

}
