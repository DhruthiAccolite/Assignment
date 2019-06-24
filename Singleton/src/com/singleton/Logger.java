package com.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	private static Logger logger = null;
	public static synchronized Logger getInstance(){
	    if(logger == null)
	        logger = new Logger();
	    return logger;
	}
	
    private final String logFile = "log.txt";
    private PrintWriter writer;
    private Logger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {}
    }
    public void withdraw (String account, double amount) {
        writer.println("WITHDRAW ("+ account + "): " + amount + "$");
    }
    public void deposit (String account, double amount) {
        writer.println("DEPOSIT (" + account + "): " + amount + "$");
    }
    public void transfer (String fromAccount, String toAccount, double amount) {
        writer.println("TRANSFER ("+ fromAccount + "->" + toAccount + "): " + amount + "$");
    }
}
