package com.pillion.coding.challenge;

public class StackImplementation {
	
	
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		System.out.println("Push --");
		
		try {
			for(int i=0; i<=3; i++) {
				System.out.println("Push - " + i);
				stack.push(i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Peek --");
		
		try {
			//for(int i=4; i>=-1; i--) {
				System.out.println("peek - " + stack.peek());
			//}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Pop --");
			for(int i=4; i>=-1; i--) {
				System.out.println("Pop - " + stack.pop());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
