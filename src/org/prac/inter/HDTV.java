package org.prac.inter;

//implements Comparable<HDTV>
public class HDTV {
	private int size;
	private String brand;
	
	
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "HDTV [size=" + size + ", brand=" + brand + "]";
	}

	
/*
	@Override
	public int compareTo(HDTV o) {
		if(this.size > o.getSize())
		{
			return 1;
		}else if(this.size < o.getSize())
		{
			return -1;
		}else
		{
			return 0;
		}
	}
	*/
	
	
	
	

}
