package com.kodnest.practice.CalculatePower;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int power=scan.nextInt();
		scan.close();
		PowerCalculator p1=new PowerCalculator();
		int res=p1.calculatePower(num, power);
		System.out.println(res);
	}

}
