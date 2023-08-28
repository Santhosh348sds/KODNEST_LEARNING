package com.kodnest.practice.GreatestDivisor;

import java.util.Scanner;

public class Main {
	public static void findGCD(int a,int b)
	{
		if(a%b==0)
		{
			int GCD = b;
			System.out.println("GCD IS"+GCD);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);
	}

}
