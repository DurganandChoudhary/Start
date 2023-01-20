package csw;
/*
 * Demonstration of sample java program
 */
public class Student {
	int rollNo;  // rollNo is an instance variable of type int
	String name; // name is an instance variable of type String
	
	//This is a no-parameter constructor to initialize the newly created object
	public Student() {
		rollNo = 123;
		name = "CSW";
	}
	
	public Student(int a, String b) {
		rollNo = a;
		name = b;
	}
	public void setRollNo(int b) {
		rollNo = b;
	}
	public void setName(String s) {
		name = s;
	}
	public static void main(String args[]) {// args holds command line argument
		Student s1 = new Student(124, "iter");//  s1 is a reference variable which points to the newly created object of type Student.
		//s1.setRollNo(123);
		//s1.setName("CSW");
		//s1.rollNo = 123;
		//s1.name = "CSW";
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
	}
}
