package csw;

public class Employee {
 int id;
 String name;
 
 public Employee () {
	 this(123, "CSW");
 }
 
 public Employee(int id, String name) {
	 this.id = id;
	 this.name = name;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println(e.id);
		System.out.println(e.name);
	}

}
