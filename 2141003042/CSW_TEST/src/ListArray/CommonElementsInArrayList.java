package ListArray;

import java.util.*;
import java.util.stream.*;
  
public class CommonElementsInArrayList {
  
    
    public static void main(String[] args)
    {
  
       
        ArrayList<String>
            list1 = new ArrayList<String>();
  
        
        list1.add("H");
        list1.add("G");
        list1.add("F");
        list1.add("G");
  
        
        System.out.println("List1: " + list1);
  
        
        ArrayList<String> list2 = new ArrayList<String>();
  
        
        list2.add("H");
        list2.add("G");
        list2.add("G");
  
        
        System.out.println("List2: " + list2);
  
        
        System.out.print("Common elements: ");
        System.out.println(list1.stream()
                               .filter(list2::contains)
                               .collect(Collectors
                                            .toList()));
    }
}