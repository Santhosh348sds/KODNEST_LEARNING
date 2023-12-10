package javaprogram5;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		double faherenheit=scan.nextDouble();
		scan.close();
		FahrenheitToCelcius fahrenheit = new FahrenheitToCelcius();
		double celcius=fahrenheit.convertFahrenheitToCelcius(faherenheit);
		System.out.println(celcius);
		

	}

}
