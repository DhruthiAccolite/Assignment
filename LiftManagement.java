package com.java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiftManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startFloor = sc.nextInt();
		List<Integer> floorNumber = new ArrayList<Integer>();
		System.out.println("More passengers(y or n)?");
		int floor;
		while ("y".equalsIgnoreCase(sc.next()) == true) {
			System.out.println("Enter which floor passenger wants to go");
			floor = sc.nextInt();
			floorNumber.add(floor);
			System.out.println("More passengers(y or no)?");
		}
		Collections.sort(floorNumber);
		System.out.println(floorNumber);
		int index = floorNumber.indexOf(startFloor);
		int temp = startFloor;
		while (index == -1) {
			temp = (temp + 1) % 5;
			index = floorNumber.indexOf(temp);

		}
		int mid = floorNumber.size() / 2;
		if (index < mid) {
			System.out.println(floorNumber.subList(0, mid));
			System.out.println(floorNumber.subList(mid, floorNumber.size()));
		} else {
			System.out.println(floorNumber.subList(0, index));
			System.out.println(floorNumber.subList(index, floorNumber.size()));
		}
	}
}
