package csw;

public class CompareToExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hemlo";
		String s4 = "flag";
		String s5 = "HeLLo";
		System.out.println(s1.compareTo(s2)); // s1 == s2 return 0 
		System.out.println(s1.compareTo(s3)); //s1 < s2 return negative
		System.out.println(s1.compareTo(s4)); // s1 > s2 return positive
		System.out.println(s1.compareToIgnoreCase(s5));
		System.out.println(s1.compareTo(s5));
	}
}
