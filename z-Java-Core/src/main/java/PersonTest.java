
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Franny";
		p2.name = "Fred";
		
		
		p1.age = 20;
		p2.age = 50;
		
		p1.makeNoise();
		
		p1.showInfo();
		p2.showInfo();
	}

}
