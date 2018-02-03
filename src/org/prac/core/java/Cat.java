package org.prac.core.java;

public class Cat extends Animal {
	
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}
	
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
	/*
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod(); //Super class 
		myAnimal.testInstanceMethod(); //Super class
		
		Animal secondAnimal = new Animal();
		secondAnimal.testInstanceMethod();
		Cat.testClassMethod();
		
	*/	
		Animal animalRefNObj = new Animal();
		Animal animalRefCatObj = new Cat();
		
		animalRefNObj.testInstanceMethod();
		animalRefCatObj.testInstanceMethod();
		
	}
}


