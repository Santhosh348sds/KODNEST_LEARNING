package com.kodnest.practice.fibonaciSereis;

import java.util.Scanner;

public class Main {
	public static void printFibonacciSereis(int n)
	{
		int a=0;
		int b=1;
		if(n==1)
		{
			System.out.println(a);
		}
		else if(n==2)
		{
		System.out.print(a+" "+b);
		}
		else if(n>=3)
		{
			System.out.print(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSereis(n);
	}

}
