package org.prac.core.java.serialization;

import java.io.Serializable;

public class TestLightTwo implements Serializable{
	
	private boolean isOn = false;
	
	public TestLightTwo() {
		// TODO Auto-generated constructor stub
	}
	
	public void switchOn() {
		isOn = true;
	}
	
	public void switchOff() {
		isOn = false;
	}
	
	
	public void printState() {
		if (isOn){
			System.out.println("TestLightTwo Lights Glowing");
		}
		else {
			System.out.println("TestLightTwo Lights are NOT Glowing");
		}
	}

}
