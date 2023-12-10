package com.kodnest.practice.powerOf2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		int res=PowerOfNumber.printPower(num);
		System.out.println(res);
	}

}
