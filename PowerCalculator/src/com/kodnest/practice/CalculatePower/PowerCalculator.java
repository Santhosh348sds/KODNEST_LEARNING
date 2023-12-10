package com.kodnest.practice.CalculatePower;

public class PowerCalculator {
	int calculatePower(int n,int power)
	{
		int total=1;
		for(int i=1;i<=power;i++)
		{
			total=total*n;
		}
		return total;
     }
}
