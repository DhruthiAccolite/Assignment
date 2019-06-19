package com.fileIOserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyContent {
	public static void main(String args[]) throws IOException {

		System.out.println("Enter the file to be copied");
		Scanner sc = new Scanner(System.in);
		String inputFileName = sc.next();
		FileInputStream fread = new FileInputStream(inputFileName);
		System.out.println("Enter the file name to where the file should be copied");
		String outputFileName = sc.next();
		FileOutputStream fwrite = new FileOutputStream(outputFileName);
		int c;
		while ((c = fread.read()) != -1)
			fwrite.write((char) c);
		fread.close();
		fwrite.close();
		System.out.println("File is Copied");
	}
}
