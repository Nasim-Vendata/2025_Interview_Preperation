package com.dsa.stack;

public class StackTester {

	public static void main(String[] args) {
		
		//Stack Using List
		
		Stack_Using_List<Integer> int_Stack = new Stack_Using_List<>();
		
		int_Stack.pushData(10);
		int_Stack.pushData(20);
		int_Stack.pushData(30);
		
		
		System.out.println(int_Stack.peekData());
		System.out.println(int_Stack.popData());
		System.out.println(int_Stack.sizeOfStack());
		
		//Using Stack Array

	}

}
