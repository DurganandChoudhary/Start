package csw;

class Animal1 {
	void eat() {
		System.out.println("Eat method of base class");
	}
}
class Dog1 extends Animal1 {
	void eat() {
		System.out.println("Eat method of derived class");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Animal1 a = new Animal1();
		Dog1 d = new Dog1();
		a.eat();
		d.eat();
		Animal1 a1 = new Dog1();
		a1.eat();
		
	}
}
