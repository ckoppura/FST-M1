package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane myPlane = new Plane(10);
		myPlane.onboard("John");
		myPlane.onboard("Steve");
		myPlane.onboard("Anna");
		System.out.println("Plane took off at: " + myPlane.takeOff());

		System.out.println("People on the plane: " + myPlane.getPassengers());

		Thread.sleep(5000);

		myPlane.land();
		System.out.println("Plane landed at: " + myPlane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + myPlane.getPassengers());
	}

}
