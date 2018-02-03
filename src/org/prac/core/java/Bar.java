package org.prac.core.java;

public class Bar extends Foo {
	void doStuff(String s) {
		System.out.println("Bar stuff with:" + s);
	}
	
	public static void main(String[] args) {
		Foo fooObj = new Bar();
		fooObj.doStufff();
		
		Bar barObj = new Bar();
		barObj.doStuff("Bar is called");
		barObj.doStufff();
	}
}
