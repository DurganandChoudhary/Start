package Circular_Queue;
import java.util.Scanner;
public class TestC_Queue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C_Queue C = new C_Queue();
		
		while(true)
		{
			System.out.println("*****Menu*****");
			System.out.println("0: Exit");
			System.out.println("1: Insert");
			System.out.println("2: Delete");
			System.out.println("3: Display");
			System.out.println("Enter Your Choice in Circular Queue");
			int op=sc.nextInt();
			switch(op)
			{
			case 0: return;
			case 1: System.out.println("Enter Elements to Insert");
			int ele=sc.nextInt();
			C.insert(ele);
			break;
			case 2: C.delete();
			break;
			case 3: System.out.println("Queue is: ");
			C.display();
			break;
			default: System.out.println("Invalid Choice");
			}
		}
	}

}
