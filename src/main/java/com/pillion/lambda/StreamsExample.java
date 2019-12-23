package com.pillion.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Shabil", "B", 30),
				new Person("Swati", "K", 33),
				new Person("Njan", "H", 31),
				new Person("Ol", "Y", 34),
				new Person("Mattol", "B", 36)
			);
		
		people.stream().filter(p -> !p.getLastName().startsWith("B"))
		.forEach(p -> System.out.println(p.getFirstName()));
	}

}
