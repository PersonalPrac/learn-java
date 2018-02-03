package org.prac.core.java.serialization;

public class Parent {
    private String parentString;
    
    public Parent() {
    	
    }
    
    public Parent(String parentString) {
        this.parentString = parentString;
        parentString = "Parent";
    }
    
    public String getParentString(){
        return parentString;
    }
}