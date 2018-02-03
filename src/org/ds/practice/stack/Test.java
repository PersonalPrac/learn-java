package org.ds.practice.stack;

public class Test {

	public static void main(String[] args) {
		
		StackImpl impl = new StackImpl(5);
		impl.push("343");
		impl.push("098");
		
		System.out.println("peek:" + impl.peek());
		
		impl.pop();
		System.out.println("peek:" + impl.peek());
		
		impl.pop();
		System.out.println("peek:" + impl.peek());
	}

}
