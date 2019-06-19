package com.java1;

import java.util.ArrayList;
import java.util.List;

public class CallList {
	List<Call> callList=new ArrayList<Call>();

	@Override
	public String toString() {
		String printit="";
		for(Call c:callList) {
			printit=printit+"Call from "+c.phoneNumber+" from:"+c.startTime+" till:"+c.endTime+" call to:"+c.callToNumber+" \n";
		}
		return printit;
		
	}
	
}
