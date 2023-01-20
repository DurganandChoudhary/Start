package HTL;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Maps {
	  public static void main(String[] args) {
	        LinkedHashMap<String, Integer> A = new LinkedHashMap<>(10,0.8f,false);
	        A.put("Eight",8);
	        A.put("Two",2);
	        A.put("Four",4);
	        A.put("Nine",9);
	        A.put("Seven",7);
	        System.out.println(A);
	        System.out.println(A.containsValue(2));
	        System.out.println(A.containsValue(3));
	        System.out.println(A.containsKey("Four"));
	        System.out.println(A.containsKey("Boiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"));
	        A.put("Rand",(int)(Math.random()*10));
	        System.out.println(A);
	        for (Map.Entry<String, Integer> e :
	                A.entrySet()) {
	            System.out.println(e.getKey());
	            System.out.println(e.getValue());
	        }
	        Set s1 = A.entrySet();
	        Iterator iter1 = s1.iterator();
	        while(iter1.hasNext()){
	            Map.Entry me = (Map.Entry) iter1.next();
	            System.out.println(me.getKey());
	            System.out.println(me.getValue());
	        }
	        System.out.println(A.isEmpty());
	        System.out.println("ArrayList size: " +A.size());
	        //clearing the ArrayList
	        A.clear();
	        System.out.println(A.isEmpty());
	    }
	  
}
