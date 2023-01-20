package Exception;

import java.io.File;
import java.util.Scanner;

public class Q2A {
	    public static void main(String[] args) {
	        int a = 12;
	        System.out.println(a/0);
	        File file = new File("test.txt");
	        Scanner sc = new Scanner(file);
	        while (sc.hasNextLine()) {
	            int i = sc.nextInt();
	            System.out.println(i);
	        }
	        sc.close();
	    }
	}
