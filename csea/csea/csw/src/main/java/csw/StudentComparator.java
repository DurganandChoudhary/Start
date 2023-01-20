package csw;

import java.util.Collections;
import java.util.LinkedList;

public class StudentComparator implements Comparator<StudentComparator>{
	
	public static void main(String[] args) {
		LinkedList<StudentComparator> l = new LinkedList();
		l.add(new StudentComparator("Ram", 12, 98.0));
		l.add(new StudentComparator("Hari", 19, 95.0));
		l.add(new StudentComparator("Ravi", 21, 97.0));
		
		for(StudentComparator s: l) {
			System.out.println(s.age + " " + s.name + " " + s.mark);
		}
		Collections.sort(l);
	}
}
