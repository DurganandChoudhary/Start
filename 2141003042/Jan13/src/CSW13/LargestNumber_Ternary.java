package CSW13;
import java.util.Scanner;
public class LargestNumber_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int n1= sc.nextInt();
		System.out.println("Enter the Second Number");
		int n2=sc.nextInt();
		int max;
		max=(n1>n2) ? n1:n2;
		System.out.println("Largest number between "+ n1+ " and "+ n2 +"is "+ max);
		

	}

}
