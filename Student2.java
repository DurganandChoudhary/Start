package CSW25;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Student2 implements Comparable<Student2>  {
	private String name;
	private int age;
	private double mark;
	
	public Student2(String n, int a, double m) {
		name = n;
		age = a;
		mark = m;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public int compareTo(Student2 s1) {
		if(this.getMark() < s1.getMark())
			return -1;
		if (this.getMark() > s1.getMark())
			return 1;
		else return 0;
	}
	public static void main(String[] args) {
		LinkedList<Student2> l = new LinkedList<>();
		l.add(new Student2("Ram", 12, 98.0));
		l.add(new Student2("Hari", 19, 95.0));
		l.add(new Student2("Ravi", 21, 97.0));
		
		for(Student2 s: l) {
			System.out.println(s.age + " " + s.name + " " + s.mark);
		}
		Collections.sort(l);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name");
		String s1 = sc.nextLine();
		for(Student2 s: l) {
			if(s.name.equals(s1)) {
				System.out.println(s.name);
				System.out.println(s.age);
				System.out.println(s.mark);
			}
		}
		
		l.remove();
		/*for(Student2 s: l) {
			System.out.println(s.age + " " + s.name + " " + s.mark);
		}
		Collections.sort(l);
		
		
		System.out.println("The number of student objects present are" + l.size());
		*/
	}
}