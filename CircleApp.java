package csw;

import java.util.Scanner;

 class Circle {

	double radius;
	
	public Circle (double r) {
		radius =r;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public double getCircumferance() {
		return 2*3.14*radius;
	}
	
}
public class CircleApp
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		double r = sc.nextDouble();
		Circle c = new Circle(r);
		
		//c.radius = 2;
		System.out.println(c.getArea());
		System.out.println(c.getCircumferance());
	}
}
