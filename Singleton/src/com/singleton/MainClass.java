package com.singleton;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		
		Logger loggerA = Logger.getInstance();
		Logger loggerB = Logger.getInstance();
		loggerA.deposit("0001", 80.5);
		loggerB.withdraw("0002", 100);
		loggerA.transfer("0001", "0003", 40);
		loggerB.withdraw("0005", 30);
	}
}
