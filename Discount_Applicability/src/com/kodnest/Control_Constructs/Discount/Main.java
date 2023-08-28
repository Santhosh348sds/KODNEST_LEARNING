package com.kodnest.Control_Constructs.Discount;

import java.util.Scanner;

public class Main {
	public static void checkDiscount(double purchaseAmount)
	{
		
		if(purchaseAmount > 100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount is not Applicable");
		}
	}
	
	public static void main(String []args) 
	{
		Scanner scan = new Scanner(System.in);
		double purchaseAmount=scan.nextDouble();
		scan.close();
		 checkDiscount(purchaseAmount);
	}
}
