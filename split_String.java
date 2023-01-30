
public class split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="This is Rahul ";
		
		String s2[]=s1.split("\\s");
		
		for(String x:s2)
		{
			System.out.println(x);
		}
		

	}

}
