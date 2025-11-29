package com.dsa.stack;

public interface My_Stack_For_List<T> {

	public void pushData(T data);
	public T popData();
	public T peekData();
	public Boolean isEmptyStack();
	public Integer sizeOfStack();
}
