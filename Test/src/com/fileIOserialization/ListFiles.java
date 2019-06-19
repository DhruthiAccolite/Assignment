package com.fileIOserialization;

import java.io.File;
import java.util.Scanner;

public class ListFiles {

	public void recursiveFileFinder(String path) {

		File directory = new File(path);
		File[] listFiles = directory.listFiles();
		if (listFiles == null)
			return;
		else {
			for (File file : listFiles) {
				if (file.isDirectory()) {
					System.out.println("Directory Name:" + file.getAbsoluteFile());
					recursiveFileFinder(file.getAbsolutePath());
					
				} else {
					System.out.println("File Name:" + file.getAbsoluteFile());
					
				}
			}
		}
	}

	public static void main(String[] args) {
		ListFiles listfile = new ListFiles();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path in which you would like to list the Files(Example c:\\\\):");
		String path = sc.next();
		listfile.recursiveFileFinder(path);
	}

}
