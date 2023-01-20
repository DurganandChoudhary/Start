package jan16;
import java.util.Scanner;
import java.util.*;

class Q1 {
	public static void main(String[] args)
	{
		
		Set<Integer> ts = new TreeSet<>();

		
		ts.add(40);
		ts.add(49);
		ts.add(48);
		ts.add(43);
		ts.add(78);
		ts.add(45);

		for (Integer value : ts)
			System.out.println(value + " ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int ele=sc.nextInt();
		
		if(ts.contains(ele))
		{
			System.out.println("The Number is present in the TreeSet is : ");
		}
		ts.remove(48);
		System.out.println(ts);

		System.out.println();
	}
}

