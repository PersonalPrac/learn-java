package org.prac.core.java;

public class TestAnimals {
	public static void main(String[] args) {
		Animals a = new Animals();
		Animals b = new Horse(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
		
		Horse horseObj = new Horse();
		horseObj.buck();
		
	}
}

class Animals {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}

class Horse extends Animals {
	public void eat() {
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}

	public void buck() {
		System.out.println("BUCK is here");
	}
}
