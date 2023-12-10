package TempConvertor;

import java.util.Scanner;

public class TemperatureApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		double fahrenheit=scan.nextDouble();
		scan.close();
		Temperature celcius = new Temperature();
		System.out.println(celcius.convertFahrenheitToCelcius(fahrenheit));
	}

}
