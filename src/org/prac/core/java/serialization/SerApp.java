package org.prac.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerApp {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	System.out.println("--Started--");
	TestClsCustomizeSerialize clsObj = new TestClsCustomizeSerialize();
	TestClsCustomizeSerialize.svOne = 1;
	TestClsCustomizeSerialize.svTwo = "hello One";
	
	clsObj.ivOne = 2;
	clsObj.ivTwo = "hello two";
	
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StaticInstanceCheck.ser"));
	oos.writeObject(clsObj);
	
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StaticInstanceCheck.ser"));
	clsObj = (TestClsCustomizeSerialize)ois.readObject();
	System.out.println("clsobj:"+ clsObj);
	
	System.out.println("--Success--");
	
}
}
