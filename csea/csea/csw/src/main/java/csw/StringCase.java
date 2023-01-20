package csw;

public class StringCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Java Cookbook";
		System.out.println("Normal:\n" + name);
		System.out.println("Upper:\t" + name.toUpperCase());
		System.out.println("Lower:\t" + name.toLowerCase());
		
		String javaName = "java cookBook"; // If it were Java identifiers :-)
		if (!name.equals(javaName))
			System.err.println("equals() correctly reports false");
		else
			System.err.println("equals() incorrectly reports true");
		if (name.equalsIgnoreCase(javaName))
			System.err.println("equalsIgnoreCase() correctly reports true");
		else
			System.err.println("equalsIgnoreCase() incorrectly reports false");
	}
}
