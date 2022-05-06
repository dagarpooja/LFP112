package com.BirdSantuary;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

	void print(Set<Bird> birds) {
//		for (int i = 0; i < birds.size(); i++) {
//			System.out.println(birds.get(i));
//		}

		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}

	void printAllFlyableBrids(Set<Bird> birds) {
//		for (int i = 0; i < birds.size(); i++) {
//			birds.get(i).fly();
//		}
		for (Bird bird : birds) {
			bird.fly();
		}
	}

	int showMainMenu() {
		System.out.println("Choose Options:");
		System.out.println("1.Add Bird\n 2.Delete Bird\n 3.Update Bird\n 4.Print Birds\n 5.Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;

	}
}