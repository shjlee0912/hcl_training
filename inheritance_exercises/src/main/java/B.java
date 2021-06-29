import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class B extends A {
	private String description;
	
	public B(String name, int i, String description) {
		super(name, i);
		this.description = description;		
	}
	
	@Override
	public void display() {
		System.out.println("Display from class B: " + this.getName() + " " + this.getI() + " " + description);
	}
}
