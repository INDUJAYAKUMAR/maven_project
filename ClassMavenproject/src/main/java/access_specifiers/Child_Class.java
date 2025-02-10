package access_specifiers;

public class Child_Class {

	public static void main(String[] args) {
		
		Main objnew = new Main();
		objnew.defaultmethod();
		objnew.publicmethod();
		objnew.protectedmethod();
		//objnew.privatemethod   ---- cannot access
	}

}
