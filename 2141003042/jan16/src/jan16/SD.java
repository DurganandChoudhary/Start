package jan16;


import java.util.LinkedList;
import java.util.Scanner;

public class SD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> A = new LinkedList<>();
        System.out.print("Enter the number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter mark: ");
            double mark = sc.nextDouble();
            A.add(new Student(name, age, mark));sc.nextLine();
        }
        for (Student X :
                A) {
            System.out.println("Name: "+X.name+"; Age: "+X.age+"; Mark: "+X.mark);
        }
        System.out.print("Enter a name: ");
        String s = sc.nextLine();
        boolean SS = false;
        for (Student X :
                A) {
            if (X.name.equals(s)) {
                System.out.println("Student data found.");
                System.out.println("Age: "+X.name);
                System.out.println("Mark: "+X.name);
            }
        }
        if(!SS) {
            System.out.println("Student data not found");
        }
        else System.out.println("Student data does not exist");
        System.out.println("Current linkedlist: "+A);
        System.out.print("Enter the index to be deleted: ");
        int x = sc.nextInt();
        if(x>A.size())
            System.out.println("OutOfBoundsException");
        else A.remove(x);
        System.out.println("Current linkedlist: "+A);
        System.out.println("The number of student objects present in the linked list: "+A.size());
    }
}

class Student {
    public String name;
    public int age;
    public double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}
