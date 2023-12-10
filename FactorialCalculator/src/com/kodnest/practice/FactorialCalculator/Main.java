package com.kodnest.practice.FactorialCalculator;

import java.util.Scanner;

public class Main {
	public static void calculateFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scan.nextInt();
		scan.close();
		calculateFactorial(n);
		
	   
	}

}
