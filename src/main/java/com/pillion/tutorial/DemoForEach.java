package com.pillion.tutorial;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1,2,3,4,5,6);
		items.forEach(i -> System.out.println(i));
		
		A a = i -> System.out.println("Interface impl " + i);
		
		a.show(3);
	}

}

interface A {
	void show(int id);
}