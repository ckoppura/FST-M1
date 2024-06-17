package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] myNumArry = { 11, 10, 56, 78, 12, 82, 33, 55 };
		System.out.println("My array befor Sort : " + Arrays.toString(myNumArry));
		ascendingOrder(myNumArry);
		System.out.println("My array after Sort : " + Arrays.toString(myNumArry));

	}

	static void ascendingOrder(int[] array) {
		int size = array.length;

		for (int i = 0; i < size; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;

			}
			array[j + 1] = key;
		}
	}

}
