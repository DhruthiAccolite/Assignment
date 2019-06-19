package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerCreators {
	public static void main(String args[]) {

		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;

		try {

			fh = new FileHandler("d://classes/MyLogFile.log");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			ExceptionGeneration eg = new ExceptionGeneration();
			try {
				eg.ArithmeticExceptionGeneration();

			} catch (ArithmeticException e) {
				logger.info("Arithmetic Exception caught");
			} finally {
				try {
					eg.ArrayExceptionGeneration();

				} catch (ArrayIndexOutOfBoundsException e) {
					logger.info("Array Index Out Of Bounds Exception caught");
				} finally {
					try {
						eg.FileNotFoundEXceptionGeneration();
					} catch (FileNotFoundException e) {
						logger.info("File Not Found Exception caught");
					}
				}
			}

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
