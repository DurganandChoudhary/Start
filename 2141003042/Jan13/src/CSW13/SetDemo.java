package CSW13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs= new HashSet<String>();
		hs.add("Delhi");
		hs.add("kolkata");
		hs.add("mumbai");
		hs.add("chennai");
		
		System.out.println(hs); 
		
		Set<String> hs1= new LinkedHashSet<String>();
		hs.add("Delhi");
		hs.add("kolkata");
		hs.add("mumbai");
		hs.add("chennai");
		
		System.out.println(hs);
		
		Set<String> hs2= new TreeSet<String>();
		hs.add("Delhi");
		hs.add("kolkata");
		hs.add("mumbai");
		hs.add("chennai");
		
		System.out.println(hs);
		
		
		
		Set<String> hs3= new TreeSet<String>();
		hs.add("Delhi");
		hs.add("kolkata");
		hs.add("mumbai");
		hs.add("chennai");
		

	}

}
