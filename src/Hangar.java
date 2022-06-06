
public class Hangar {

	public static void main(String[] args) {
		Car car = new Car("Peugeot", 500);
		Boat boat = new Boat("Zodiac", 100);
		System.out.println(car.doStuff());
		System.out.println(boat.doStuff());
	}

}
