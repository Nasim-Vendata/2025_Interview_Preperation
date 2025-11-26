package com.dsa.hashmap;

import java.util.Objects;

public class My_HashMap<K,V> {

private static class Node<K,V>{
		
		K key;
		V value;
		Node<K,V> next;
		
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}	
	}
	
	private Node<K,V>[] buckets;
	private Integer size=0;
	private Integer capacity;
	private final Float loadFactor=0.75f;
	
	public My_HashMap() {
		this.capacity=16;
		this.buckets=new Node[capacity];
	}
	
	private Integer getBucketIndex(K key) {
		return Math.abs(Objects.hashCode(key))%this.capacity;
	}
	
	private void resize() {
		
		Node<K,V>[] oldBuckets=buckets;
		capacity*=2;
		buckets=new Node[capacity];
		size=0;
		
		for(Node<K,V> headNode : oldBuckets) {
			while(headNode != null) {
				putData(headNode.key,headNode.value);
				headNode=headNode.next;
			}
		}
	}
	
	
	
	//PUT Operation
	
	public void putData(K key,V value) {
		
		int index=this.getBucketIndex(key);
		
		Node<K,V> head=buckets[index];
		
		while(head!=null) {
			if(Objects.equals(head.key, key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		
		Node<K,V> newNode=new Node<>(key,value);
		
		newNode.next=buckets[index];
		
		buckets[index]=newNode;
		
		size++;
		
		if(((1.0*size)/capacity)>=loadFactor) {
			resize();
		}
	}
	
	public V getData(K key) {
		
		int index=getBucketIndex(key);
		
		Node<K,V> headNode=buckets[index];
		
		while(headNode != null) {
			if(Objects.equals(headNode.key, key)) {
				return headNode.value;
			}
			headNode=headNode.next;
		}
		return null;
	}
	
	public V removeData(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets[index] = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}
