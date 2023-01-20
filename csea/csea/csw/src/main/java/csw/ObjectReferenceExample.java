package csw;
 class Animal {
	public void makeSound() {
		System.out.println("Animal makesound method");
	}
}
 class Dog extends Animal {
	public void makeSound() {
		System.out.println("Dog makesound method");
	}
	
}
public class ObjectReferenceExample {
	public static void main(String[] args) {
		Animal dogObj = new Dog(); // Legal declaration as Dog is a subclass of Animal
		//Dog d1 = new Animal();
		dogObj.makeSound();
		Dog d = new Dog();
		d.makeSound();
		// Dog animalObj = new Animal(); // Illegal declaration as Animal is not a subclass pf Dog
	}
}
