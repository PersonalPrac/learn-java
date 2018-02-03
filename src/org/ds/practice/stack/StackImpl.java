package org.ds.practice.stack;



/**
 * Source: https://www.youtube.com/watch?v=fZNiAeGAdF0
 * @author r.satti
 *
 */
public class StackImpl {

	private int maxSize;
	private int top;
	private String[] dataBagArray;

	// PUSH, POP, EMPTY, PEEK

	public StackImpl(int n) {
		maxSize = n;
		dataBagArray = new String[maxSize];
		top = 0;
	}

	public void push(String element) {

		if (top < maxSize) {
			dataBagArray[top] = element;
			top++;
		} else { // Reached max size
			System.out.println("Stack overflow");
		}

	}

	public String pop() {
		
		if (!this.isEmpty())
		{
			// last element inside the stack
			String tempPoppedElement = this.peek();
			dataBagArray[top-1] = null;
			top --;
			return tempPoppedElement;
		}
		else
		{
			return null;
		}
		

	}

	public boolean isEmpty() {

		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String peek() {
		// Should check top is not emtpy
		
		// if (top > 0)
		if (!this.isEmpty()) {
			return dataBagArray[top - 1];
		} else {
			return null;
		}

	}

}
