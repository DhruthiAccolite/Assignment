package com.java1;

import java.time.LocalDateTime;
import java.util.Random;

public class Telephone1 implements Telephone{

	public String myPhoneNumber;
	
	public Telephone1(String myPhoneNumber) {
		this.myPhoneNumber = myPhoneNumber;
	}

	CallList callDirectory=new CallList(); 
	@Override
	public void dial(String phoneNumber) {
		System.out.println("Calling"+phoneNumber);
		LocalDateTime t=LocalDateTime.now();
		Random r=new Random();
		int duration=r.nextInt(100);
		System.out.println("Assuming call to be picked up and run for "+duration+"microseconds");
		for(int i=0;i<duration;i++) {}
		LocalDateTime t2=LocalDateTime.now();
		callDirectory.callList.add(new Call(myPhoneNumber,phoneNumber,t,t2));
	}

	@Override
	public void recieve(String phoneNumber) {
		System.out.println("Recieved call from"+phoneNumber);
		Random r=new Random();
		int duration=r.nextInt(100);
		LocalDateTime t=LocalDateTime.now();
		for(int i=0;i<duration;i++) {}
		System.out.println("Call ended from "+phoneNumber);
		LocalDateTime t2=LocalDateTime.now();
		callDirectory.callList.add(new Call(phoneNumber,myPhoneNumber,t,t2));
	}

	@Override
	public void reject(String phoneNumber) {
		System.out.println("Rejected call from"+phoneNumber);
		
	}

	@Override
	public void listCalls() {
		
		System.out.println(callDirectory.toString());
	}

}
