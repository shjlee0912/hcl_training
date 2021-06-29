import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class A {
	private String name;
	private int i;
	
	public void display() {
		System.out.println("Display from Class A: " + name + " " + i);
	}
}
