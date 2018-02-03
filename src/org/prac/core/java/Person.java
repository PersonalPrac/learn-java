package org.prac.core.java;

public class Person extends Human {
	public void eat() {
		System.out.println("Person eating Veg ");
	}

	public void eat(String s) {
		System.out.println("Person eating " + s);
	}

	public static void main(String[] args) {
		Human humanObj = new Human();
		humanObj.eat();  // Human Eat method will be called
		
		Person personObj = new Person();
		personObj.eat(); // Person eating veg
		
		Human humanPerson = new Person();
		humanPerson.eat(); // Person eating veg
		

		Person personObjApples = new Person();
		personObjApples.eat("Apples"); // Person eating Apples
		
		
		Human a2 = new Human(); 
		a2.eat ("treats");  //Compile time error
		
		Human ah2 = new Person(); 
		ah2.eat("Carrots"); //Compile time error

		
	}
}
