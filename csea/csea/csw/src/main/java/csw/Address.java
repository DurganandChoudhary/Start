package csw;

import java.util.Map;
import java.util.TreeMap;

public class Address {
 private int plotno;
 private String post;
 private String city;
 
 public Address(int a, String b, String c) {
	 plotno = a;
	 post = b;
	 city = c;
 }
 public int getPlotno() {
	 return plotno;
 }
 public String getPost() {
	 return post;
 }
 public String getCity() {
	 return city;
 }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 TreeMap<String, Address> hm = new TreeMap();
	 hm.put("Ram", new Address(12, "Nayapalli", "Bhubaneswar"));
	 hm.put("Hari", new Address(14, "Pokhariput", "Bhubaneswar"));
	 hm.put("iter", new Address(104, "khandagiri", "Bhubaneswar"));
	 
	 for(Map.Entry<String, Address> e: hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println(e.getValue().getPost());
			System.out.println(e.getValue().getPlotno());
			System.out.println(e.getValue().getCity());
		}
	}

}
