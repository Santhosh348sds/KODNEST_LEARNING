package com.kodnest.Control_Contructs;

import java.util.Scanner;

public class Main {
	public static void checkGrade(int grade) {
		if(grade > 50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

		public static void main(String[] args) 
		{
	Scanner scan = new Scanner(System.in);
	int grade = scan.nextInt();
	scan.close();
	checkGrade(grade);
		}
}