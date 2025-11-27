package com.dsa.linkedlist;

import javax.management.RuntimeErrorException;

public class My_LinkedList {

	private Node head;
	private Node tail;
	private Integer size = 0;
	
	private static class Node{
		
		Integer value;
		Node next;
		
		Node(Integer data){
			this.value=data;
		}
	}
	
	//Add First
	
	public void addFirst(Integer data) {	
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
		if(tail == null) {
			tail=newNode;
		}
		size++;
	}
	
	// Add Last
	
	public void addLast(Integer data) {
		Node newNode = new Node(data);
		
		if(tail == null) {
			tail=head=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		size++;
	}
	
	// Insert At Index
	
	public void insertAt(Integer index,Integer data) {
		
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0) {
			addFirst(data);
			return;
		}
		
		if(index == size) {
			addLast(data);
			return;
		}
		
		Node newNode=new Node(data);
		
		Node temp=head;
		
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
		
	}
	
	// Delete First
	
	public Integer deleteFirst() {
		
		if(head == null) {
			throw new RuntimeException("List is Empty !!");
		}
		
		Integer result=head.value;
		
		head=head.next;
		
		size--;
		
		if(head == null) {
			tail=null;
		}
		
		return result;
	}
	
	// Delete Last
	
	public Integer deleteLast() {
		
		if(size == 0) {
			throw new RuntimeException("List is Empty !!");
		}
		
		if(size == 1) {
			return deleteFirst();
		}
		
		Node temp = head;
		
		for(int i=0;i<size-1;i++) {
			temp=temp.next;
		}
		
		Integer result=tail.value;
		
		tail=temp;
		
		tail.next=null;
		
		size--;
		 
		return result;
	}
	
	// Delete At Index
	
	public Integer deleteAtIndex(Integer index) {
		
		if(index <0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0) {
			return deleteFirst();
		}
		
		if(index == size-1) {
			return deleteLast();
		}
		
		Node temp =head;
		
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		
		Integer result = temp.next.value;
		temp.next=temp.next.next;
		size--;
		
		return result;
	}
	
	// Search an Element
	
	public Boolean searchElement(Integer key) {
		
		Node temp=head;
		
		while(temp.next != null) {
			if(temp.value == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	// Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
