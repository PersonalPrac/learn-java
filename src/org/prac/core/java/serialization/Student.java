package org.prac.core.java.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id;
	
	String name;
	
	public static String staticVariable;
	
	public Student(int id, String name) {
		this.id =id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",staticVariable:"+ staticVariable+"]";
	}
}
