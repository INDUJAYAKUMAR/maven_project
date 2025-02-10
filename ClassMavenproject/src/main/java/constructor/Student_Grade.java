
//Write a program to find the grade of 2 students based on total marks(3 subjects)
//a. Get the student‟s marks by constructor
//b. Return total mark to in main method
//c. Find the grade of each student.



package constructor;

public class Student_Grade {
	 static int Stdmark1;
	 static int Stdmark2;
	
	public Student_Grade(int eng1,int mal1,int maths1,int eng2, int mal2, int maths2)
	{
		 Stdmark1 = eng1+mal1+maths1;
		 int stdmarkper1 = (Stdmark1*100)/300;
		System.out.println("Total mark of Student 1 is: "+Stdmark1);
		if (stdmarkper1>=90)
		{
			System.out.println("Grade:A");
		}
		else if(stdmarkper1>=80)
		{
			System.out.println("Grade:B");
		}
		else if(stdmarkper1>=70)
		{
			System.out.println("Grade:C");
		}
		else if(stdmarkper1>=60)
		{
			System.out.println("Grade:D");
		}
		else
		{
			System.out.println("Failed");		
		}
		
		 Stdmark2 = eng2+mal2+maths2;
		System.out.println("Total mark of Student 2 is: "+Stdmark2);
		int stdmarkper2 = (Stdmark2*100)/300;
		
		if (stdmarkper2>=90)
		{
			System.out.println("Grade:A");
		}
		else if(stdmarkper2>=80)
		{
			System.out.println("Grade:B");
		}
		else if(stdmarkper2>=70)
		{
			System.out.println("Grade:C");
		}
		else if(stdmarkper2>=60)
		{
			System.out.println("Grade:D");
		}
		else
		{
			System.out.println("Failed");		
		}
		
	}
		
	
	public static void main(String[] args)
	{
		
	Student_Grade std1 = new Student_Grade(80,70,90,50,90,87);
	}

}
