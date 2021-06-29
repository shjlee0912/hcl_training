
public class Dog extends Animal {
	
	public Dog() {
		super();
	}
	
	public Dog(String furColor) {
		super(furColor);
	}

	public void eat() {
		System.out.println("I am eating");
	}
	
	public void bark() {
		System.out.println("I am barking");
	}
	
	@Override
	public void makeNoise(String noise) {
		System.out.println("Barking: " + noise);
	}
}
