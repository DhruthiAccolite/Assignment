package com.generics;

public class MainClass {
	public static void main(String args[]) {
		Vehicle es=new Vehicle(10,"scooty es");
		Vehicle duro=new Vehicle(10,"mahindra duro");
		Vehicle rayz=new Vehicle(20,"yamaha rayz");
		
		if(es.compareTo(duro)==0) {
			System.out.println("Milage is same");
		}
		else {
			System.out.println("Milage is not same");
		}
		if(duro.equals(rayz)) {
			System.out.println("Same vehicle");
		}
		else {
			System.out.println("Vehicle not same");
		}

	}
}
