package com.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionGeneration {
	public int ArithmeticExceptionGeneration() {
		return 1/0;
	}
	public int ArrayExceptionGeneration() {
		int a[]=new int[5];
		return a[6];
	}
	public void FileNotFoundEXceptionGeneration() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(new File("filenotfound.txt")));

	}
	public static void main(String args[]) throws FileNotFoundException {
		ExceptionGeneration eg=new ExceptionGeneration();
		eg.ArithmeticExceptionGeneration();
		eg.ArrayExceptionGeneration();
		eg.FileNotFoundEXceptionGeneration();
	}
	
}
