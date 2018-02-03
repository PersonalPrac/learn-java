package org.prac.io;

import java.io.Console;


//https://www.javatpoint.com/java-console-class
public class ConsoleExample {

	public static void main(String[] args) {
	
		
		//Note: https://stackoverflow.com/questions/8138411/masking-password-input-from-the-console-java
			
		Console console = System.console();
		System.out.println("Enter Your Name:");
		String name = console.readLine();
		System.out.println("Welcome" +name);
		
		
		// Read Password
		char[] chArray =console.readPassword();
		String pass = String.valueOf(chArray);
		System.out.println("Password is"+pass);
		
		// manually zero the returned character array after processing to minimize the lifetime of sensitive data in memory.
		java.util.Arrays.fill(chArray, ' ');

	}
}
