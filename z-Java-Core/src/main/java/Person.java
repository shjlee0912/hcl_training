
public class Person {
	
	private int age; //int is a primitive - value is stored directly variable
	String name; //reference/address To a live String object out on the heap
	double heightInInches;
	
	static final int COUNT = 7; //static == blueprint
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}

	public static int getCount() {
		return COUNT;
	}

	public void makeNoise() {
		System.out.println("Says Hi!");
	}
	
	public void showInfo() {
		System.out.println("|name: " + name + " |age: " + age + " |height: " + heightInInches);
	}
}
