package com.fileIOserialization;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteFiles {

	public void textFilesDeleter(String path) {

		File directory = new File(path);

		List<String> textFiles = new ArrayList<String>();
		for (File file : directory.listFiles()) {
			if (file.getName().endsWith((".txt"))) {
				if (file.delete()) {
					System.out.println("File deleted successfully" + file.getName());
				} else {
					System.out.println("Failed to delete the file" + file.getName());
				}
			}
		}

	}

	public static void main(String[] args) {
		DeleteFiles listfile = new DeleteFiles();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path in which you would like to list the Files(Example c:\\\\):");
		String path = sc.next();
		listfile.textFilesDeleter(path);
	}

}
