package csw;

public class MethodOverloading {
	public static int add(int a , int b) {
		return a + b;
	}
	
	public static double add(int a , int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		System.out.println(" Adding with 2 parameters");
		System.out.println(add(3, 8));
		System.out.println(" Adding with 3 parameters");
		System.out.println(add(3, 8, 9));
	}
}
