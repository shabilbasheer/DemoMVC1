package com.pillion.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class Unit1ExcersiceJava7 {
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
		java.util.Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
			}});		
		
		//Create a method to print the list
		System.out.println("Print All");
		printAll(people);
		System.out.println();
		
		//Create a method to print all users with last name with B
		System.out.println("Last Name with B");
		printAllBasedConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("B");
			}
		});
		
		System.out.println();
		System.out.println("First Name with S");
		printAllBasedConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("S");
			}
		});
		
	}

	private static void printAllBasedConditionally(List<Person> people, Condition c) {
		for(Person p : people) {
			if(c.test(p))
			System.out.println(p);
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}
}

interface Condition {
	boolean test(Person p);
}
