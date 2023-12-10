package com.kodnest.pratice.PrimeNumbers;

import java.util.Scanner;

public class Main {
	public static void printPrimes(int n)
	{
		int count=0;
		for(int i=3;count<n;i++)
		{
			boolean res=checkPrimes(i);
			if(res==true)
			{
				System.out.println(i+" ");
				count++;
			}
		}
	}
	
	public static boolean checkPrimes(int n)
	{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}}
			return true;
		}
	
	
	public static void main(String []args)
	{
     Scanner scan=new Scanner(System.in);
     int a=scan.nextInt();
     scan.close();
     printPrimes(a);
	}

}
