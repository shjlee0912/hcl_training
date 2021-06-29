
public class InheritenceExample {

	public static void main(String[] args) {
		System.out.println("Bike example:");
		Bike M = new Bike();
		
		System.out.println("\nDog example:");
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
		dog.makeNoise("Food!");
		
		Animal animal = new Animal();
		animal.makeNoise("Hello");
		
		System.out.println("\nA and B example:");
		A a = new A("Albert",3);
		B b = new B("Sam", 20, "Student");
		a.display();
		b.display();
	}

}
