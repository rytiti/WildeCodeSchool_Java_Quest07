
public class Car extends Vehicle {
	// constructor
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	// method
	@Override
	public String doStuff() {
		return "I am " + this.getBrand() + " and i go zoom zoom!";
	}
}
