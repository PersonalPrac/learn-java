package org.ds.practice.linkedlist;

/**
 * Source : https://www.youtube.com/watch?v=MFef6tTGoXw
 * @author r.satti
 *
 */


// List is dynamic data structures while array is not dynamic
public class LinkedList {
	private Node head;
	
	
	public LinkedList() {
		
	}
	
	public boolean isEmpty() {
		
		if(head == null) {
			return true;
		}else
		{
			return false;
		}
	
	}
	
	public void add(Object obj) {
		if(isEmpty()) {
			head = new Node(obj);
		}
		else
		{
			Node current = head;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(new Node(obj));
		}
		
	}
	
	public Integer size(){
		Integer size =0;
		Node current = head;
		
		while (current != null) {
			size++;
			current = current.getNext();
		}
			
		return size;
	}
	
	/*
	public Object getElement(int index)
	{
		
	}*/
}
