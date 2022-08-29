public class Reverse {
    public static void reverse(int n) {
        if(n<10)
        {
            System.out.println(n);
            return;
        }
        else
        {
            System.out.print(n%10);
            reverse(n/10);
        }
    }

    public static void main(String[] args) {
        int n=4735;
        System.out.println("Reversed Number:");
        reverse(n);
    }

}
