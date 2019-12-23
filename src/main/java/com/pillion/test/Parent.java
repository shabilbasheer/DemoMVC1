package com.pillion.test;

public class Parent {
	public static void foo() {
		System.out.println("-- Super foo");
	}
	
	public void bar() {
		System.out.println("-- Super bar");
	}
	
	static {
		System.out.println("Static block");
		int i = 100;
		System.out.println("i-- " + i--);
		System.out.println("--i " + --i);
		System.out.println("i " + i);
		System.out.println("i++ " + i++);
		System.out.println("++i " + ++i);
		System.out.println("i " + i);
		int j = i-- - --i;
		System.out.println("sub - " + j);
	}
}
