package com.kodnest.practice.PowerOfDigitsNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int power = scan.nextInt();
		scan.close();
		PowerOfDigitCalculator p1=new PowerOfDigitCalculator();
		int res=p1.calculateDigit(num, power);
		System.out.println(res);
		
	}

}
