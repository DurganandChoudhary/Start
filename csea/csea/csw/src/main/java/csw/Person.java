package csw;

public class Person {
	private String firstname;
	private String lastname;
	private int age;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setFirstname("hello");
		p.setLastname("world");
		p.setAge(20);
		System.out.println(p.getFirstname());
		System.out.println(p.getLastname());
		System.out.println(p.getAge());
	}

}
