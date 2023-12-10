package com.kodnest.practice.VendingMachineSimulator;

import java.util.Scanner;

public class Main {
	public static void getproduct(String productCode)
	{
		switch(productCode)
		{
		case "po1":
			System.out.println("coco cola");
			break;
		case "po2":
			System.out.println("pepsi");
			break;
		case "po3":
			System.out.println("Fanta");
			break;
		case "po4":
			System.out.println("Jal Jeera");
			break;
		case "po5":
			System.out.println("Mountain Dew");
			break;
		case "po6":
			System.out.println("Baot Guava");
			break;
			default:
				System.out.println("Panaka");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the productCode");
		String productCode=scan.next();
		scan.close();
		getproduct(productCode);
		
	}

}
