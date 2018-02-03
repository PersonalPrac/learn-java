package org.prac.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DePersistStudent {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persistStudent.txt"));

		Student student = (Student) ois.readObject();
		
		System.out.println("--Success--:" + "ID:"+student.id+", Name:"+student.name+",static data:"+ student.staticVariable);
		System.out.println("Actual Student:"+ Student.staticVariable);
		ois.close();

	}
}
