package Linked_Linear_Q;
import java.util.Scanner;

public class Test_Linked_Queue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Linked_Queue Q1=new  Linked_Queue();
		 
		 while(true)
		 {
			 System.out.println("*****Menu*****");
			 System.out.println("0.Exit");
			 System.out.println("1.Insert");
			 System.out.println("2.Delete");
			 System.out.println("3.Display");
			 System.out.println("Enter Your Choice");
			 
			 int ch=sc.nextInt();
			 
			 switch(ch)
			 {
			 case 0:return;
			 case 1:System.out.println("Elements to insert: ");
			     int ele=sc.nextInt();
				 Q1.insert(ele);
				 break;
			 case 2:Q1.delete();
			 break;
			 case 3:System.out.println("Queue is :");
			 Q1.display();
			 break;
			 default :System.out.println("Invalid Choice");
			 }
		 }

	}

}
