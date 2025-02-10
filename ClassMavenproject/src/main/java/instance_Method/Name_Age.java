// Write a program to set your name and age by a instance method


package instance_Method;

public class Name_Age {
	

	public void Name()
	{
	String name = "Indu";
	System.out.println("My name is : "+name);
	}
	public void Age()
	{
	int age = 34;
	System.out.println("My age is : "+age);
	}

	public static void main(String[] args) {
      
		Name_Age newobj = new Name_Age();
		newobj.Name();
		newobj.Age();		

	}

}
