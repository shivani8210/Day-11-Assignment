package com.shi.q1;

public interface Z extends X, Y{

	@Override
	default void method1() {
		
		System.out.println("Inside the method1 of Z");
		
	}

	@Override
	default void method2() {
		
		X.super.method2();
		
	}
	
	void methodZ();
	
}
