package jan16;

import java.util.Scanner;
import java.util.LinkedList;

public class Student 
{
	private static final LinkedList<Student> Studentlist = null;
	private String name;
	private int age ;
	private float mark;
	public Student(String name, int age, float mark) 
	{
		this.name=name;
		this.age=age;
		this.mark=mark;
		
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public float getmark() {
		return mark;
	}
	public String toString() {
		return "Name: "+name+", Age:"+age +" , Mark : "+mark;
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		LinkedList<Student> StudebntList=new LinkedList<>();
		Studentlist.add(new Student("RAHUL",19,16));
		Studentlist.add(new Student("AMAN",9,11));
		Studentlist.add(new Student("ROHIT",22,36));
		
		for(Student s:Studentlist){
			System.out.println("Name: "+s.name+", Age:"+s.age +" , Mark : "+s.mark);
			System.out.println("Enterb Name :");
			String str =sc.next();
			for(Student s1: Studentlist) {
				if(s1.name.equals(str)) {
					System.out.println(s.name);
					System.out.println(s.age);
					System.out.println(s.mark);
				}
				else {
					System.out.println("Name not present in the list");
				}
				Studentlist.remove();
				System.out.println("Name: "+s.name+", Age:"+s.age +" , Mark : "+s.mark);
			}
			break;
		}
	}
	int size=Studentlist.size();
	System.out.println("Size of LinkedList ="+size);
}

}
