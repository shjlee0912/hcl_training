import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Animal {
	
	private String furColor;
	
	public Animal(String furColor) {
		this.furColor = furColor;
	}
	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public void makeNoise(String noise) {
		System.out.println("*Making Noise*");
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
}
