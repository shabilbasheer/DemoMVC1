package com.pillion.lambda;

public class MethodReferenceExample1 {
	public static void main(String[] args) {
		//Thread thread = new Thread(() -> process());
		Thread thread = new Thread(MethodReferenceExample1 :: process);
		thread.start();
	}
	
	public static void process() {
		System.out.println("Printed...");
	}
}
