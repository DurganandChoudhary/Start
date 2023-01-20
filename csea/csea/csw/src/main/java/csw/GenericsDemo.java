package csw;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(90);
		//al.add("iter");
		//al.add(2.35);
		
		int sum = 0;
		for(int i = 0; i < al.size(); i++) {
			sum = sum + Integer.parseInt(al.get(i).toString());
		}
		System.out.println("sum is " + sum);
		
		ArrayList<Integer> al1 = new ArrayList();
		al1.add(100);
		al1.add(10);
		al1.add(60);
		
		int sum1 = 0;
		for (int j = 0; j < al1.size(); j++) {
			sum1 = sum1 + al1.get(j);
		}
		System.out.println("sum is " + sum1);
	}
}
