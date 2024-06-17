package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = { 10, 77, 10, 54, -11, 10 };

		System.out.println("My Array " + Arrays.toString(arry));

		int searchFor = 10;
		int sum = 30;

		System.out.println("My Result : " + result(arry, searchFor, sum));
	}

	public static boolean result(int[] array, int searchFor, int sum) {

		int temp = 0;
		for (int number : array) {
			if (searchFor == number) {
				temp = temp + number;
			}

			if (temp > sum) {
				break;
			}
		}
		return temp == sum;

	}

}
