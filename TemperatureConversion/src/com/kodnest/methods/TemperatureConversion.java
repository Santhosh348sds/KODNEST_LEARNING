package com.kodnest.methods;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature conversion Tool!");
		System.out.println("-------------------------------------------");
		System.out.println("Select an option:");
		System.out.println("1. Convert Celcius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celcius");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the temperature in Celcius:");
			double celcius=scan.nextDouble();
			celciusToFahrenheit(celcius);
		}
		else if(choice==2)
		{
			System.out.println("Enter the temperature in Fahrenheit:");
			float fahrenheit=scan.nextFloat();
			fahrenheitToCelcius(fahrenheit);
		}
		else
		{
			System.out.println("warning! Entered choice is incorrect. Enter your choice once again...");
		}
	}
	public static void celciusToFahrenheit(double celcius)
	{
		double fahrenheit=(celcius*9/5)+32;
		System.out.println(celcius+"°C is Equaivalent to "+fahrenheit+"°F");
	}
	
	public static void fahrenheitToCelcius(float fahrenheit)
	{
		float celcius=(fahrenheit-32)*5/9;
		System.out.println(fahrenheit+"°F is Equaivalent to "+celcius+"°C");
	}
}
