package com.arrayDemo;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	
	
	int[][] number;

	public TwoDArray(int row, int col) {
		number = new int[row][col];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of row : ");
		int row = sc.nextInt();

		System.out.println("Enter the number of column : ");
		int col = sc.nextInt();

		TwoDArray twoDArray = new TwoDArray(row, col);
		twoDArray.saveNumbers(row, col);

		System.out.println("------------Printing an Array to file-----------------");
		twoDArray.printArray(row, col);

		sc.close();
	}

	private void printArray(int row, int col) {
		try {
			PrintWriter writer = new PrintWriter("abc.txt");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					writer.print(number[i][j]+"\t");
				}
				writer.print("\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void saveNumbers(int row, int col) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the [" + i + "][" + j + "] : ");
				number[i][j] = sc.nextInt();
			}
		}

		sc.close();
	}

} 


