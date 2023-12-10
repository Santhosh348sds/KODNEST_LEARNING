package com.kodnest.agecalculator;

import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age)
	{
		if(age>0 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("Teen");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("Adult");
		}
		else if(age>60)
		{
			System.out.println("Senior");
		}
		else
		{
			System.out.println("Please Enter an integer....");
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integer");
		int age=scan.nextInt();
		scan.close();
		categorizeAge(age);
	}

}
