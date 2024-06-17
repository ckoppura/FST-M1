package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.make = 2024;
		myCar.color = "Black";
		myCar.transmission = "Manual";

		myCar.displayCharacterstics();
		myCar.accelerate();
		myCar.brake();
	}

}
