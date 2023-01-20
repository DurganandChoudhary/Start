package csw;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "iter"; // by using string literal (memory efficient)
		char c[] = {'i','t','e','r'};
		String s1 = new String(c); // using character array
		String s2 = new String("iter"); // using new operator
		
	
		
		System.out.println("s " + s + " s1 " + s1 + " s2 "+ s2);
		
		// immutability of String
		s.concat("college");
		System.out.println("s " + s);
		s = s.concat("college");
		System.out.println("s " + s);
		
		//mutable
		StringBuffer sb = new StringBuffer("computerscience");
		sb.append("branch");
		System.out.println("value " + sb);
		
		//mutable
		StringBuilder sb1 = new StringBuilder("csw1");
		sb1.append("class");
		System.out.println("value is " + sb1);

	}
}
