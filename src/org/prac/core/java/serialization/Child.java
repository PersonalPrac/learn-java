package org.prac.core.java.serialization;

import java.io.Serializable;

public class Child extends Parent implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String childString;
    
    public Child(String childString) {
        super(childString);
        this.childString = childString;
    }
    public String getChildString(){
        return childString;
    }
}