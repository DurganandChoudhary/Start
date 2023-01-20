package csw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * The Set interface is present in java.util package.
 * It is an unordered collection of objects in which duplicate values are not allowed.
 * It is an interface that implements set from mathematics.
 * The implementing classes are HashSet, TreeSet, LinkedHashSet.
 * HashSet gives output in random order.
 * LinkedHashSet gives output as per the order of insertion.
 * TreeSet gives output according to sorted order.
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<String>();
		hs.add("Delhi");
		hs.add("Delhi");
		hs.add("Kolkata");
		hs.add("Bhubaneswar");
		hs.add("Mumbai");
		hs.add("Cochi");
		
		System.out.println(hs);
		
		Set<String> hs1 = new LinkedHashSet<String>();
		hs1.add("Delhi");
		hs1.add("Kolkata");
		hs1.add("Bhubaneswar");
		hs1.add("Mumbai");
		hs1.add("Cochi");
		hs1.add("Bhubaneswar");
		
		System.out.println(hs1);
		/*Iterator<String> it = hs1.iterator();
		if (it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		Set<String> hs2 = new TreeSet<String>();
		hs2.add("Delhi");
		hs2.add("Kolkata");
		hs2.add("Bhubaneswar");
		hs2.add("Mumbai");
		hs2.add("Cochi");
		hs2.add("Cochi");
		//hs2.add(null);
		System.out.println(hs2);

	}

}
