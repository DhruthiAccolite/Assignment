package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortingFrequency {

	public static void sortbykey(HashMap<String, Integer> map) {
		List<Integer> sortedKeys = new ArrayList<Integer>(map.values());
		
		Collections.sort(sortedKeys);
		Collections.reverse(sortedKeys);
		int i=0;
		while (map.isEmpty() != true) {
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				
				if (entry.getValue()==sortedKeys.get(i) && map.isEmpty() != true) {
					System.out.println(entry.getKey());
					map.remove(entry);
					i=i+1;
					if(map.isEmpty() || i>=sortedKeys.size()) return;
					break;
					
				
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings");
		int l = sc.nextInt();
		System.out.println("Enter the list of strings");
		List<String> str = new ArrayList<String>();
		for (int i = 0; i < l; i++) {
			str.add(sc.next());
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : str) {
			if (map.containsKey(s)) {
				int f = map.get(s);
				map.replace(s, f + 1);
			} else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
		sortbykey(map);

	}
}
