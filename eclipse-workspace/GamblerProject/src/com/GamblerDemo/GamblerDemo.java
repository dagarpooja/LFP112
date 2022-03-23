package com.GamblerDemo;

import java.util.Scanner;

public class GamblerDemo {
	
	double stake;
	double betPrice;
	int numberOfWin;
	int numberOfLoss;
	double stakeValue;
	double goal;
	int numberOfPlays;
	
	public static void main(String[] args) {
		GamblerDemo gd = new GamblerDemo();
		gd.playGame();
		gd.showResult();
		
	}
	public void showResult(){
		
		System.out.println("Number of time Game played is:"+numberOfPlays);
		System.out.println("stake is:"+stake);
		System.out.println("stackValue is:"+stakeValue);
		System.out.println("Goal is:"+goal);
		System.out.println("Bet Price is:"+betPrice);
		System.out.println("Number of Win is:"+numberOfWin);
		System.out.println("Number of Loss is:"+numberOfLoss);
		System.out.println("Ammount of Win and Loss is:"+(stake-stakeValue));
	
	}
	
	GamblerDemo(){
		Scanner userInput = new Scanner(System.in);	
		System.out.println("Enter stake Price");
		stake=userInput.nextDouble();
		stakeValue = stake;

		System.out.println("Enter stake Goal");
		goal=userInput.nextDouble();

		System.out.println("Enter stake bet price");
 		betPrice=userInput.nextDouble();
	}
	// this method returns true/win when probability  is less then 0.5 else it will return false/loss
	public boolean winOrLoss() {
		if(Math.random()<0.5) // returns a double value b/w 0.0 to 1.0 
			return true;
		else
			return false;
	}
	public void playGame() {
		numberOfPlays++;
		if(winOrLoss()) {
			numberOfWin++;
			stake=stake+betPrice;
		}else {
			numberOfLoss++;
			stake=stake-betPrice;
		}
		
		if(stake<=50 || stake>=goal) 
			return;
		
		else
			playGame();
		
	}

}
