package Q10;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Data");
		
		System.out.println("Student S1");
		
		Student s1=new Student();
		String n=sc.next();
		int r=sc.nextInt();
		double m=sc.nextDouble();
		
		System.out.println("Student s2");
		Student s2=new Student();
		String n1=sc.next();
		int r1=sc.nextInt();
		double m1=sc.nextDouble();
		
		System.out.println("Student s3");
		
		Student s3=new Student();
		String n11=sc.next();
		int r11=sc.nextInt();
		double m11=sc.nextDouble();
		
		System.out.println("Printed Data"+"\n");

		s1.setData(n, r, m);
		s2.setData(n1, r1, m1);
		s3.setData(n11, r11, m11);
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}
