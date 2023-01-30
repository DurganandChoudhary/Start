package CSW25;

public class StringSplitExample {
public static void main(String args[]) {
String myStr = "My Favourite Programming Language : Java";
String[] arrOfStr = myStr.split( ":");
for (String piece : arrOfStr) {
System.out.println(piece);
}
}
}