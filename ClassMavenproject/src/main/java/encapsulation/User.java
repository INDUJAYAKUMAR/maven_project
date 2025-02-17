package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank newobj = new Bank();
		newobj.setPin(123);
		System.out.println(newobj.getPin());

	}



}
