package abstraction;

public class Childofabstraction extends Abstraction {

	public static void main(String[] args) {
		//Childofabstraction objchild = new Childofabstraction();// creation of child class object
		Abstraction objchild = new Childofabstraction();//parent class object creation
		objchild.instancemethod();
		objchild.abstractmethod();
		objchild.abstractmethod1(5, 7);
		//objchild.childinstance(); doesnot work because parent class object is created
		System.out.println("Sum of float is: "+objchild.abstractfloat());
 
	}

	@Override
	public void abstractmethod() {
		System.out.println("This is the abstract method from parent class");
		
	}

	@Override
	public void abstractmethod1(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is: "+sum);
		
	}

	@Override
	public float abstractfloat() {
		float Sumfloat = 3+5.5f;
		return Sumfloat;
	}
	public void childinstance()
	{
		System.out.println("Child instance");
	}

}
