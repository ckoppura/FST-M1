package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("AP");
		hs.add("TG");
		hs.add("BR");
		hs.add("KA");
		hs.add("JK");
		hs.add("TN");

		System.out.println("size of the hashset : " + hs.size());
		System.out.println("Removed BR from the set : " + hs.remove("BR"));

		hs.remove("TT");
		System.out.println("Checking TG is present in list or not : " + hs.contains("TG"));

		System.out.println("My Complete List is :" + hs);

	}

}
