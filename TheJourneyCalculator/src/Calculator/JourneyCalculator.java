package Calculator;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a speed value");
		double speed = scan.nextDouble();
		System.out.println("Enter a time value");
		double time = scan.nextDouble();
		scan.close();
		Distance distance = new Distance();
		System.out.println("The Distance is: "+distance.calculateDistance(speed,time));

	}

}
