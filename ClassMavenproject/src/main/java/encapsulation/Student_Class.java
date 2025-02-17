package encapsulation;

public class Student_Class {
 private String Name ;
 private int RollNo;
 
 
public String getName() {  // getter method of name (instance method)
	return Name;
}
//if name is equal to name then we use this.Name;
public void setName(String name) { // setter method of name
	Name = name; // value of the local variable is stored in the instance variable declared.because local variable has access only in that method but instance variable can be access thruout the class
}
public int getRollNo() {  // getter method of rollno (instance method)
	return RollNo;
}
public void setRollNo(int rollNo) { // setter method of rollno
	RollNo = rollNo;
}
 
 
	
}
