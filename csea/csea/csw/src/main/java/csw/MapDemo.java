package csw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * The Map interface is present in java.util package.
 * It represents a mapping between a key and a value.
 * A map can not contain duplicate keys and each key can map to at most
 * one value.
 * The implementing classes are HashMap, TreeMap, LinkedHashMap.
 * HashMap gives output in random order.
 * LinkedHashMap gives output as per the order of insertion.
 * TreeMap gives output according sorted order of keys.
 */
public class MapDemo {
	public static void main(String args[]) {
		TreeMap<String, Integer> hm = new TreeMap();
		hm.put("iter", 76876);
		hm.put("chandan", 676576);
		hm.put("ravi", 1234);
		hm.put("sagnik", 4567);
		hm.put("bikas", 6785);
		
		
		for(Map.Entry<String, Integer> e: hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		Set set1 = hm.entrySet();
		Iterator iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			Map.Entry me = (Map.Entry) iterator1.next();
			System.out.println("The value is: " + me.getValue() + " and key is:  "+ me.getKey());
		 }
		 
	}
	
	
	

}
