package Exception;

public class Q4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        try{
            System.out.println("Divide by 0: "+(a/0));
        } catch (ArithmeticException A){
            System.out.println(A);
            System.out.println("This is in the catch block");
        } finally {
            System.out.println("This is in the finally block");
        }
    }
}