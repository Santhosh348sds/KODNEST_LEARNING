package com.kodnest.practice.TablePrinter;

import java.util.Scanner;

public class Main {
	public static void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = scan.nextInt();
		scan.close();
		printTable(num);
	}

}
