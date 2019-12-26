package com.pillion.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleFilter {

	public static void main(String[] args) {
		List<Apple> appleList = Arrays.asList(
			new Apple("Kashmir", "Red", 10),
			new Apple("Kashmir", "Green", 9),
			new Apple("Kashmir", "Yellow", 8),
			new Apple("Kerala", "Red", 7),
			new Apple("Kerala", "White", 6)
		);
		
		getAppleCount("Kashmir", "Red", appleList);
	}

	private static void getAppleCount(String city, String color, List<Apple> list) {
		//filter 1
		Predicate<Apple> isCity = i -> i.getCity().equals(city);
 
        //filter2
		Predicate<Apple> isColor = i -> i.getColour().equals(color);
		
		String count = list.stream().filter(isCity.and(isColor)).map(e -> e.getCount()).findAny().toString();
		List<Apple> list1 = list.stream().filter(isCity.and(isColor)).collect(Collectors.toList());
		System.out.println(count);
		System.out.println(list1.size());
	}
}
