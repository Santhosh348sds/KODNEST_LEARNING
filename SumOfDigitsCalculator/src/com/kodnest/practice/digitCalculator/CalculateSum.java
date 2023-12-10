package com.kodnest.practice.digitCalculator;

public class CalculateSum {
	public static void calculateSumOfDigits(int num)
	{
		int sum=0;
		int rem=0;
		while(num>0)
		{
			rem = num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
