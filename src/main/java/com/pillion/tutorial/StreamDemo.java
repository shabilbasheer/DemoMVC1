package com.pillion.tutorial;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1,2,4,3,5,6);
		
		items.stream().sorted().forEach(System.out::println);
	}

}
