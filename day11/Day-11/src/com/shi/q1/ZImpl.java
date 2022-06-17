package com.shi.q1;

public class ZImpl implements Z{

	@Override
	public void method1() {
		
		Z.super.method1();
		
	}

	@Override
	public void method2() {
		
		Z.super.method2();
		
	}

	@Override
	public void methodZ() {
		
		System.out.println("Inside the methodZ pf ZImpl");
		
	}

}
