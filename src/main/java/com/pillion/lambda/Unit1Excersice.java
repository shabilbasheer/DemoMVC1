package com.pillion.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
			new Person("Shabil", "B", 30),
			new Person("Swati", "K", 33),
			new Person("Njan", "H", 31),
			new Person("Ol", "Y", 34),
			new Person("Mattol", "B", 36)
		);
		
		//Sort by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//Create a method to print the list
		System.out.println("Java 8 - Print All");
		//printAllBasedConditionally(people, p -> true);
		//performConditionally(people, p -> true, p -> System.out.println(p));
		performConditionally(people, p -> true, System.out::println);
		System.out.println();
		
		//Create a method to print all users with last name with B
		System.out.println("Last Name with B");
		//printAllBasedConditionally(people, p -> p.getLastName().startsWith("B"));
		performConditionally(people, p -> p.getLastName().startsWith("B"), p -> System.out.println(p));
		
		System.out.println();
		System.out.println("First Name with S");
		//printAllBasedConditionally(people, p -> p.getFirstName().startsWith("S"));
		performConditionally(people, p -> p.getFirstName().startsWith("S"), p -> System.out.println(p.getFirstName()));
	}
	
	private static void printAllBasedConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p))
			System.out.println(p);
		}
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consume) {
		for(Person p : people) {
			if(predicate.test(p))
			consume.accept(p);
		}
	}
}