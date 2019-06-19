package com.java1;

import java.time.LocalDateTime;

public class Call {
	public String phoneNumber;
	public String callToNumber;
	public LocalDateTime startTime;
	public LocalDateTime endTime;
	public Call(String phoneNumber, String callToNumber, LocalDateTime startTime, LocalDateTime endTime) {
		this.phoneNumber = phoneNumber;
		this.callToNumber = callToNumber;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
}
