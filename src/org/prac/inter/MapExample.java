package org.prac.inter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
public static void main(String[] args) {
	
	Map<String,String> hashMapObj = new HashMap<>();
	hashMapObj.put("Alive is", "Awesome");
	hashMapObj.put("Love","Yourself");
	
	System.out.println(hashMapObj);
	
	Map<String, String> treeMapObj = new TreeMap<>();
	treeMapObj.put("Love","Yourself");
	treeMapObj.put("Alive is", "Awesome");
	
	
	System.out.println(treeMapObj);
	
}
}
