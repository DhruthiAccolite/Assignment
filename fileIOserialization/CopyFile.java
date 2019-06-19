package com.fileIOserialization;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter source file name");
		String source=sc.next();
		File sourceFile=new File(source);
		System.out.println("Enter destination directory");
		String destination=sc.next();
		destination=destination+sourceFile.getName();
		Path temp = Files.move(Paths.get(source),Paths.get(destination));

		if (temp != null) {
			System.out.println("File renamed and moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}
}
