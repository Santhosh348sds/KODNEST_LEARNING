package program2;

import java.util.Scanner;

public class DoubleNumber {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		scan.close();
		System.out.println(doubleTheNumber(num));
	}
	
public static int doubleTheNumber(int num)
{
	return 15*2;
}
}
