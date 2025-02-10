package access_specifiers;

public class Main {
	public void publicmethod()
	{
	System.out.println("It is a public method");
	}
	private void privatemethod()
	{
	System.out.println("It is a private method");
	}
	protected void protectedmethod()
	{
	System.out.println("It is a protected method");
	}
	 void defaultmethod()
	{
	System.out.println("It is a default method");
	}
	

	public static void main(String[] args) {
		
		Main obj = new Main();
		
		obj.publicmethod();
		obj.privatemethod();
		obj.protectedmethod();
		obj.defaultmethod();
	}

}
