package com.pillion.test;


public class Child extends Parent {
	public static void foo() {
		System.out.println("-- Child foo");
	}
	
	public void bar() {
		System.out.println("-- Child bar");
	}
	
	public static void main(String args[]) {
		Parent p = new Child();
		Child c = new Child();
		
		p.foo();
		c.foo();
		
		p.bar();
		c.bar();
	}
}
