package activities;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many names you eant to enter : ");
		int names = sc.nextInt();
		System.out.print("Enter names : ");
		for (int i = 0; i < names; i++) {
			myList.add(sc.nextLine());

		}
		sc.close();
		System.out.println("List of names you have entred");
		for (String name : myList) {
			System.out.println(name);
		}
		System.out.println("3rd Name in list : " + myList.get(2));
		System.out.println("Chekking name is exist or not  : " + myList.contains("name"));
		System.out.println("Size of array list  : " + myList.size());
		myList.remove("name");
		System.out.println("Size of array list after remove : " + myList.size());
	}

}
