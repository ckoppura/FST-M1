package activities;

public class Activity8 {

	public static void main(String[] args) {
		MyCustomExceptionTest msg = new MyCustomExceptionTest();
		try {
			msg.exceptionTest("This is Custom Exception");
			msg.exceptionTest(null);

		} catch (CustomException e) {
			System.out.println("Inside catch block: " + e.getMessage());
			e.printStackTrace();

		}

	}

}
