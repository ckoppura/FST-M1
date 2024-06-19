package activities;

public class MyCustomExceptionTest {

	public void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String value is null");
		} else {
			System.out.println(str);
		}
	}
}
