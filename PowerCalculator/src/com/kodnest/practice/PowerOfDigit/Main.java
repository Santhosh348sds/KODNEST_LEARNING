package com.kodnest.practice.PowerOfDigit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		PowerDigits p1=new PowerDigits();
		int res=p1.countThePower(n);
		System.out.println(res);
	}

}
