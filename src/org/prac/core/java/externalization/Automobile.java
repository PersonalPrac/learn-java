package org.prac.core.java.externalization;

import java.io.Serializable;

class Automobile {

	/*
	 * Instead of making thse members private and adding setter and getter methods,
	 * I am just giving default access specifier. You can make them private members
	 * and add setters and getters.
	 */
	String regNo;
	String mileage;

	/*
	 * A public no-arg constructor
	 */
	public Automobile() {
	}

	Automobile(String rn, String m) {
		regNo = rn;
		mileage = m;
	}
}