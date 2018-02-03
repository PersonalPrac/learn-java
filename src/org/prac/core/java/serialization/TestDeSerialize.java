package org.prac.core.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Starting TestDeSerialize");
		FileInputStream inputStream = new FileInputStream("Test.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		
		TestLightOne testLightOne ;
		TestLightTwo testLightTwo ;
		
		testLightOne =(TestLightOne) objectInputStream.readObject();
		testLightTwo = (TestLightTwo) objectInputStream.readObject();
		
		testLightOne.printState();
		testLightTwo.printState();
		objectInputStream.close();
		
	}
	
}
		
		