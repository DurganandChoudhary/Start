package csw;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 76;
		int b = 0;
		try {
		int c = a/b;
		System.out.println("c is"  + c);
		}catch(ArithmeticException  e) {
			System.out.println("It is not possible to divide by zero");
		}finally {
			System.out.println("This block always executes irrespective of the exception");
		}
		
	}

}
