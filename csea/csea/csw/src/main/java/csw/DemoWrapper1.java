package csw;
/*
 * All the 8 wrapper classes are derived from java.lang.Number class.
 * To perform boxing, the constructors of wrapper classes are needed and
 * also valueOf() method is used.
 * 
 * Float has 3, Character has 1 and other have 2 constructors.
 * So in one constructor they can pass their own data
 * and in the other they pass their own data in String form.
 */
public class DemoWrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st way of wrapping (constructor way) 
		Integer i1 = new Integer(124);
		Integer i2 = new Integer("125");
		
		Double d1 = new Double(12.34);
		Double d2 = new Double("34.56");
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		// 2nd way of wrapping (valueOf() method)
		Integer i3 = Integer.valueOf(126);
		Integer i4 = Integer.valueOf("127");
		
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		int a = i1.intValue(); // unboxing
		int b = i2.intValue(); //unboxing
		int c = i3;				// Auto unboxing
		int d = i4;				//Auto unboxing
		
	}

}
