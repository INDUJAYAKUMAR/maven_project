package final_keyword;


public final class Final_Eg {
	
	public final void FinalEg()
	{
		System.out.println("Printing the final method example");
	}

	public static void main(String[] args) {
		 final String a = "Me";
		//a = "Indu";  Cant edit the value of a as it is declared as final and it is inside the main method
		 Final_Eg obj = new Final_Eg();
		 obj.FinalEg();
	}

}
