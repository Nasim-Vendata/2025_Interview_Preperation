package com.dsa.stack;

public class My_Stack_Using_Array {

	private Integer[] arr;
	private Integer top;
	private Integer capacity;
	
	public My_Stack_Using_Array(Integer capacity) {
		this.capacity=capacity;
		arr = new Integer[capacity];
		top=-1;
	}
	
	 // Push operation
    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow!");
        }
        arr[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow!");
        }
        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }
        return arr[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Size of stack
    public int size() {
        return top + 1;
    }
}
