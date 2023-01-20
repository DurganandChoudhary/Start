package csw;

public class WithoutToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p.hashCode());
		Person p1 = new Person();
		System.out.println(p1.hashCode());
	}

}
