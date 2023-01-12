

package m_project;
import java.util.Scanner;

public class TestLinkedList {

	private static LinkedList n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.create();
		while(true)
		{
			System.out.println("************Menu**********");
			System.out.println("0. Exit");
			System.out.println("1. display");
			System.out.println("2. count");
			System.out.println("3. Search");
			System.out.println("4. insBeg");
			System.out.println("5. insEnd");
			System.out.println("6. insAny");
			System.out.println("7. Find 2nd max");
			System.out.println("8: Remove Duplicate");
			System.out.println("9. Count Unique");

			System.out.println("Enter your Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 0: return;
			case 1: l1.display();
			        break;
			case 2: System.out.println("Number of Nodes="+l1.count());        
			        break;
			case 3: System.out.println("Element to search");
			int ele=sc.nextInt();
			Node a=l1.search(ele);
			if(a==null)
				System.out.println("Element not Found");
			else
			   System.out.println("Found at refrence "+a);
			
			break;
			case 4:l1.insBeg();
			break;
			case 5:l1.insEnd();
			break;
			case 6:l1.insAny();
			break;
			case 7:System.out.println("The 2nd max is "+l1.find2ndMax());
			break;
		
			case 8:l1.removeDuplicate();
			break;
			case 9:l1.countUnique();
			break;
			default: System.out.println("Invalid choice");
			}
			

		}

	}
}
