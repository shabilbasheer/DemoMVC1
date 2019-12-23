package com.pillion.coding.challenge;

public class Print1To100 {

	public static void main(String[] args) {
		//Multiple of 3 prints Fizz
		//Multiple of 5 prints Buzz
		//Multiple of 5 & 3 prints FizzBuzz
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i%3 == 0) {
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
