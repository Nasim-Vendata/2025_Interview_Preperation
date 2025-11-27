package com.dsa.doublylinkedlist;

public class My_DoublyLinkedList {

	Node head;
	Node tail;
	Integer size;
	
	private static class Node{
		
		Integer value;
		Node next;
		Node prev;
		
		Node(Integer data){
			this.value=data;
		}
	}
	
	// Add First
	
	 // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        size++;
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    // Insert at index
    public void insertAt(int index, int data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev.next = newNode;
        temp.prev = newNode;

        size++;
    }

    // Delete first
    public int deleteFirst() {
        if (head == null) throw new RuntimeException("List empty");

        int val = head.value;
        head = head.next;

        if (head != null) head.prev = null;
        else tail = null;

        size--;
        return val;
    }

    // Delete last
    public int deleteLast() {
        if (tail == null) throw new RuntimeException("List empty");
        if (size == 1) return deleteFirst();

        int val = tail.value;
        tail = tail.prev;
        tail.next = null;

        size--;
        return val;
    }

    // Delete at index
    public int deleteAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteLast();

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        int val = temp.value;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
        return val;
    }

    // Print forward
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print backward
    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
