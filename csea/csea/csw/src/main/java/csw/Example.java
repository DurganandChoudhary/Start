package csw;

interface Example1 {
	void study();
	void learn();
	void understand();
}

abstract class Student1 implements Example1{
	public void study() {
		System.out.println("Practice to study");
	}
	public void learn() {
		System.out.println("Lets learn java");
	}
}

class Teacher extends Student1 {
	public void understand() {
		System.out.println("Lets understand the concepts");
	}
}
public class Example {
	public static void main(String args[]) {
		Teacher t = new Teacher();
		t.study();
		t.learn();
		t.understand();
	}
}
