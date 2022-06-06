
public class Boat extends Vehicle {
	// constructor
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	// method
	@Override
	public String doStuff() {
		return "I am " + this.getBrand() + " and i go glug glug!";
	}
}
