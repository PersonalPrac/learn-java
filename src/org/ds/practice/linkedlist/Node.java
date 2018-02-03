package org.ds.practice.linkedlist;

public class Node {

	private Object value;
	
	//Pinter to next node
	private Node next;
	
	public Node(Object element) {
		value = element;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object element) {
		this.value = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
