 	package csw;

public class StringBuilderDemo {
public static void main(String[] argv) {
		
		// Internally StringBuilder's append() is called.
		String s1 = "Hello" + ", " + "World";
		System.out.println(s1);
		
		// Explicitly Build a StringBuilder, and append some things to it.
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello");
		sb2.append(',');
		sb2.append(' ');
		sb2.append("World");
		
		sb2.deleteCharAt(1);
		System.out.println(sb2);
		sb2.delete(5, 7);
		System.out.println(sb2);
		sb2.insert(8, 'S');
		System.out.println(sb2);
		sb2.reverse();
		sb2.replace(2, 4, "is");
		// Get the StringBuilder's value as a String, and print it.
		String s2 = sb2.toString();
		System.out.println(s2);
		
		// Now do the above all over again, but in a more
		// concise (and typical "real-world" Java) fashion.
		System.out.println(
		new StringBuilder()
		.append("Hello")
		.append(',')
		.append(' ')
		.append("World"));
		}

}
