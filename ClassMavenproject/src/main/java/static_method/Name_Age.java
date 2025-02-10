//Write a program to set your name and age by a static method

package static_method;

public class Name_Age {

	public static void main(String[] args) {
		System.out.println("My name is : "+ Name_Age.Name());
		
		System.out.println("My age is : "+ Name_Age.Age());
	
	}
	public static String Name()
	{
	 String n = "Indu" ;	 	
	 return n;
	}
	public static int Age()
	{
		int a = 34;
		return a;
	}

}

