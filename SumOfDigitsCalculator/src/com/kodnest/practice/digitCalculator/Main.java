package com.kodnest.practice.digitCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		CalculateSum.calculateSumOfDigits(num);
	}
}
