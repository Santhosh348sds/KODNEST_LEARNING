package com.kodnest.Bitwise_swapper;

import java.util.Scanner;

public class BitwiseSwapper {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Integer");
		int a=scan.nextInt();
		System.out.println("Enter the Second Integer");
		int b=scan.nextInt();
		scan.close();
		swapUsingBitwise(a,b);
	}
	public static void swapUsingBitwise(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping: First = "+a+" ,Second = "+b);
	}	
}
