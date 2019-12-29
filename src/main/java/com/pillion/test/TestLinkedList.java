package com.pillion.test;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(500);
		stack.offerLast(600);
		stack.add(700);
		stack.push(800);
		stack.push(900);
		
		System.out.println(stack);
		
		System.out.println("pop - " + stack.pop());
		System.out.println("peek - " + stack.peek());
		System.out.println(stack);
	}

}
