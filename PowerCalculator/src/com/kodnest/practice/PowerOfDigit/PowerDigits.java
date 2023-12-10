package com.kodnest.practice.PowerOfDigit;

public class PowerDigits {
	int countThePower(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

}
