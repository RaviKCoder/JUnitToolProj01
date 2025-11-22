package com.ravi.main;

import com.ravi.service.ArithmeticOperation;

public class Main {
	public static void main(String[] args) {
	ArithmeticOperation ao=new ArithmeticOperation();
	
	System.out.println("Result: "+ao.add(10, 20));
	System.out.println("Result: "+ao.sub(20, 10));
}
}
