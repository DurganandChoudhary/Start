package jan16;
import java.util.*;

public class PriorityQueueExample {
 public static void main(String[] args) {
 // Creating the empty priority queue
 PriorityQueue<String> prQueue = new PriorityQueue<String>();
 
 // Now adding the items
 prQueue.add("Java");
 prQueue.add("Python");
 prQueue.add("C");
 prQueue.add("C++");
 
 // Printing the most priority element
 System.out.println("The head value by using peek function is: " + prQueue.peek());
 
 // Now printing all elements
 System.out.println("The total queue elements are:");
 Iterator itr1 = prQueue.iterator();
 while (itr1.hasNext()){
 System.out.println(itr1.next());
 }
 // Now removing the top priority element (or head of queue)
 // And printing the modified PriorityQueue
 prQueue.poll();
 System.out.println("After removing an element with poll function: ");
 Iterator<String> itr2 = prQueue.iterator();
 while (itr2.hasNext()) {
 System.out.println(itr2.next());
 }
 // Removing one value of Java
 prQueue.remove("Java");
 System.out.println("after removing Java with remove function:");
 Iterator<String> itr3 = prQueue.iterator();
 while (itr3.hasNext()){
 System.out.println(itr3.next());
 }
 // Checking a particular element in the PriorityQueue
 boolean a = prQueue.contains("C");
 System.out.println("Does this priority queue contains C:"  + a);
 }
}