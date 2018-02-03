package org.prac.core.java.serialization;

public class BarTest {
	public static void main(String[] args) {
		Foo foo = new Bar(5);
		
		if (foo instanceof Foo) {
			System.out.println("It's a Foo!");
		}
		
		if (foo instanceof Bar) {
			System.out.println("It's a BAR");
		}
	}
}
