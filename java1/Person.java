package com.java1;

public class Person {
	public static void main(String args[]) {
		Telephone1 mobile=new Telephone1("9898989999");
		mobile.dial("9777438789");
		mobile.recieve("9738424864");
		System.out.println("LIST OF CALLS");
		mobile.listCalls();
		
		Telephone1 landline=new Telephone1("08049988988");
		landline.dial("9777438789");
		landline.recieve("9738424864");
		System.out.println("LIST OF CALLS");
		landline.listCalls();
		
	}
}
