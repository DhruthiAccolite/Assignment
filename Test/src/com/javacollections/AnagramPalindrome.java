package com.javacollections;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		HashMap<Character, Integer> freq=new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++) {
			
			if(freq.containsKey(input.charAt(i))==true) {
				
				freq.put(input.charAt(i), i);
			}
		}
	}
}
