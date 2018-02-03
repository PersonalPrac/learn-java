package org.prac.core.java.serialization;

import java.io.Serializable;

public class TestLightOne implements Serializable{
	
	private boolean isOn = false;
	private String hello = "This is the new field";
	
	public TestLightOne() {
		// TODO Auto-generated constructor stub
	}
	
	public void switchOn() {
		isOn = true;
	}
	
	public void switchOff() {
		isOn = false;
	}
	
	public void fieldShow(){
		hello = "new thing";
				
	}
	
	
	public void printState() {
		if (isOn){
			System.out.println("TestLightOne Lights Glowing");
		}
		else {
			System.out.println("TestLightOne Lights are NOT Glowing");
		}
	}

}
