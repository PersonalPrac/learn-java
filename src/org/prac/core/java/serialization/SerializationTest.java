package org.prac.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestLightOne testLightOne = new TestLightOne();
		TestLightTwo testLightTwo = new TestLightTwo();
		
		testLightOne.switchOn();
		testLightTwo.switchOff();
		
		/*
		//Serialization
		FileOutputStream fileOutputStream = new FileOutputStream("Test.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(testLightOne);
		objectOutputStream.writeObject(testLightTwo);
		objectOutputStream.close();
		*/
		
		//Deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.ser"));
		TestLightOne str1 = (TestLightOne)ois.readObject();
		TestLightTwo str2 = (TestLightTwo) ois.readObject();
		str1.printState();
		str2.printState();
		
		System.out.println("--Success--");
		
	}
}
