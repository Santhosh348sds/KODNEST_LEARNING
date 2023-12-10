package com.kodnest.practice.PowerOfDigitsNumber;

public class PowerOfDigitCalculator {
	int calculateDigit(int n,int power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
			res=res*n;
		}
		int r1=countDigit(res);
		return r1;
	}
	
	int countDigit(int res)
	{
		
		int count=0;
		while(res!=0)
		{
			res=res/10;
			count++;
		}
		return count;
	}
}
