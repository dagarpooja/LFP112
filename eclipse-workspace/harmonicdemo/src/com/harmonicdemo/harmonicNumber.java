package com.harmonicdemo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class harmonicNumber {
	
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("##.00");

		System.out.println("Type the number for which you want to find harmonic number?");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double harmonicNumber = 0;
		if (number == 0) {
			System.out.println("Invalid input!!!!");
		} else {
			for (int i = 1; i <= number; i++) {
				harmonicNumber += (1.0 / i);
			}
			System.out.println("Harmonic number for " + number + " is : " + decimalFormat.format(harmonicNumber));
		}

		sc.close();
	}

} 


