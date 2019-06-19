package com.generics;

public class Vehicle implements Comparable<Vehicle>{
	int milage;
	String modelNo;
	
	@Override
	public int compareTo(Vehicle v) {
		if(this.milage>v.milage) {
			return 1;
		}
		else if(this.milage<v.milage) {
			return -1;
		}
		else
			return 0;
	}
	
	public boolean equals(Vehicle v) {
		if(this.modelNo==v.modelNo) {
			return true;
		}
		return false;
	}
	
	public String toString(Vehicle v) {
		return ("Vehicle model No:"+v.modelNo+" with milage"+v.milage);
	}

	public Vehicle(int milage, String modelNo) {
	
		this.milage = milage;
		this.modelNo = modelNo;
	}

}
