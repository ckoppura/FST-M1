package com.example.fst_m1_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {

	  ArrayList<String> list;

	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("Car");
		list.add("Bicycle");
		list.add("Tricycle");
	}

	@Test
	public void insertTest() {
		assertEquals(3, list.size(), "Size Did not match");
		list.add(2, "Bike");
		assertEquals(4, list.size(),"Size Did not match");
		System.out.println(list);
		assertEquals("Car", list.get(0),"Car did not match");

	}
	
	@Test
	public void replaceTest() {
		list.set(0, "new Car");
		System.out.println("In replace Test : "+list);
		assertEquals("new Car", list.get(0),"Car did not match");
	}
}
