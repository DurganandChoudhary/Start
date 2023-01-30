package CSW25;

public class StringSplitWithLimitExample {
public static void main(String args[]) {
String myStr = "I@love@java";
String[] arrOfStr = myStr.split("@", 2);
for (String piece : arrOfStr) {
System.out.println(piece);
}
}
}