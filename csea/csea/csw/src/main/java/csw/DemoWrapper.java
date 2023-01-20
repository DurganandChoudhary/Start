package csw;
/* int		Integer
 * float	Float
 * long		Long
 * double	Double
 * char		Character
 * short	Short
 * boolean	Boolean
 * byte		Byte
 * There are 8 Wrapper classes in java for 8 corresponding primitive data types.
 * 
 */
public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;// a is a variable of type integer
		
		Integer i1 = new Integer(a);// passing primitive type variable into Integer object
		// The process of converting any primitive type variable into its corresponding
		// wrapper class object is called boxing/wrapping
	
		Integer i2 = a;// Autoboxing
		
		System.out.println("a = " + a);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		
		int b = i1.intValue();// unboxing-getting primitive type value from corresponding object
		System.out.println("b = " + b);
		
		int c  = i2;	// Auto unboxing- converting an object to primitive type automatically by the compiler
		System.out.println("c = " + c);
	}

}
