package com.BirdSantuary;


import java.util.Scanner;
import java.util.Set;

import com.BirdSantuary.Bird.Color;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary ");
		UserInterface userInterface = new UserInterface();
		
		
	
		Main main = new Main();
		
		int userOption = userInterface.showMainMenu();
		main.handleUserSelection(userOption);
		
//		int option = 0;
//		while(option!= 5) {
//		int userOption = userInterface.showMainMenu();
//		main.handleUserSelection(userOption);
				
		}
//		Duck duck = new Duck();
//		duck.birdId = "d001";
//		Ostrich ostrich = new Ostrich();
//		ostrich.birdId = "o001";
//		Flemingo flemingo = new Flemingo();
//		flemingo.birdId = "f001";
//		Parrot parrot = new Parrot();
//		parrot.birdId = "p001";
//		Parrot parrot2 = new Parrot();
//		parrot2.birdId = "p001";
//		Penguine penguine = new Penguine();
//		penguine.birdId = "pn001";
//		
//		
//
//		birdRepo.addBirds(duck);
//		birdRepo.addBirds(flemingo);
//		birdRepo.addBirds(ostrich);
//		birdRepo.addBirds(penguine);
//		birdRepo.addBirds(parrot);
//		birdRepo.addBirds(parrot);
//		
//
//		UserInterface userInterface = new UserInterface();
//		userInterface.print(birdRepo.getBirdList());
//
//		System.out.println("Printing Birds after removal");
//
//		// birdRepo.removeBirds(duck);
//		// birdRepo.removeBirds(flemingo);
//		// birdRepo.removeBirds(ostrich);
//		// birdRepo.removeBirds(penguine);
//		// birdRepo.removeBirds(parrot);
//
//		// userInterface.print(birdRepo.getBirdList());
//
//		userInterface.printAllFlyableBrids(birdRepo.getBirdList());
		
	
	public void addBird() {
	//BirdRepository birdRepo = new BirdRepository();
//		
//		Duck duck = new Duck();
//		duck.birdId = "d001";
//		Ostrich ostrich = new Ostrich();
//		ostrich.birdId = "o001";
//		Flemingo flemingo = new Flemingo();
//		flemingo.birdId = "f001";
//		Parrot parrot = new Parrot();
//		parrot.birdId = "p001";
//		Parrot parrot2 = new Parrot();
//		parrot2.birdId = "p001";
//		Penguine penguine = new Penguine();
//		penguine.birdId = "pn001";
//		
//		birdRepo.addBirds(duck);
//		birdRepo.addBirds(flemingo);
//		birdRepo.addBirds(ostrich);
//		birdRepo.addBirds(penguine);
//		birdRepo.addBirds(parrot);
//		birdRepo.addBirds(parrot);
		
		//BirdRepository birdRepo =  new BirdRepository.createSingalObject();
		Scanner sc = new Scanner(System.in);
		Bird b = new Bird();
		System.out.println("Enter the bird id: ");
		String bId = sc.nextLine();
		b.setBirdId(bId);
		
		System.out.println("Enter the bird name: ");
		String bName = sc.nextLine();
		b.setName(bName);
		
		System.out.println("Enter the bird color: ");
		String bColor = sc.nextLine();
		b.setColor(bColor);
		
		BirdRepository birdRepo = new BirdRepository();
		birdRepo.addBirds(b);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(birdRepo.getBirdList());
		}
				
				
	
	
	public void handleUserSelection(int userOption) {
		BirdRepository birdRepo = new BirdRepository();
		switch(userOption) {
		case 1:
			addBird();
			break;
		case 2:
			System.out.println("Bird Id:");
			Scanner sc = new Scanner(System.in);
			String birdId = sc.next();
			Bird bird = birdRepo.getBird(birdId);
			birdRepo.removeBirds(bird);
			
		case 3 :
			Set<Bird> birdList = birdRepo.getBirdList();
			UserInterface userInterface = new UserInterface();

			userInterface.print(birdList);
		}
	}
}