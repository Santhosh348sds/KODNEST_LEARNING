package com.kodnest.methods;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double purchaseAmount=scan.nextDouble();
		System.out.println("Enter the tax rate(in decimal form):");
		double taxRate=scan.nextDouble();
		scan.close();
		System.out.println("Total cost including tax: "+calculateTotalWithTax(purchaseAmount,taxRate));
	}
	public static double calculateTotalWithTax(double purchaseAmount,double taxRate)
	{
		double taxAmount=purchaseAmount*taxRate;
		return taxAmount+purchaseAmount;
	}

}
