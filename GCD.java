import java.util.Scanner;
public class GCD
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a=sc.nextInt();
        int b= sc.nextInt();

        int g=findGCD(a,b);
        System.out.println("GCD= "+g);
    }

    public static int findGCD(int a, int b)
    {
        if(a%b==0)
            return b;
        else
            return findGCD(b,a%b);
    }
}
