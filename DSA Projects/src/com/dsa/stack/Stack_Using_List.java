package com.dsa.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack_Using_List<T> implements My_Stack_For_List<T>{

	
	private List<T> myStack;
	
	public Stack_Using_List() {
		myStack=new ArrayList<>();
	}
	
	
	@Override
	public void pushData(T data) {
		myStack.add(data);	
	}

	@Override
	public T popData() {
		if(isEmptyStack()) {
			throw new RuntimeException("Stack is Empty !!");
		}
		return myStack.remove(sizeOfStack()-1);
	}

	@Override
	public T peekData() {
		if(isEmptyStack()) {
			throw new RuntimeException("Stack is Empty !!");
		}
		return myStack.get(sizeOfStack()-1);
	}

	@Override
	public Boolean isEmptyStack() {
		return myStack.isEmpty();
	}

	@Override
	public Integer sizeOfStack() {
		return myStack.size();
	}

}
