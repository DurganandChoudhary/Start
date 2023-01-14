package LinearQ;

import java.util.Scanner;



public class TestQueue_L {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		L_Queue_Array Q = new L_Queue_Array();
		
		while(true)
		{
			System.out.println("*****Menu*****");
			System.out.println("0: Exit");
			System.out.println("1: Insrt");
			System.out.println("2: Delete");
			System.out.println("3: Display");
			System.out.println("Enter Your Choice");
			int op=sc.nextInt();
			switch(op)
			{
			case 0: return;
			case 1: System.out.println("Enter Elements to Insert");
			int ele=sc.nextInt();
			Q.insert(ele);
			break;
			case 2: Q.delete();
			break;
			case 3: System.out.println("Queue is: ");
			Q.display();
			break;
			default: System.out.println("Invalid Choice");
			}
		}
	}

}
