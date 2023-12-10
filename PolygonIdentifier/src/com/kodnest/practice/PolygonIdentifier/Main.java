package com.kodnest.practice.PolygonIdentifier;

import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)
	{
		switch(sides)
		{
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
			default:
				System.out.println("Polygon");
		}
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer between(3-6)");
		int sides = scan.nextInt();
		scan.close();
		identifyPolygon(sides);
	}

}
