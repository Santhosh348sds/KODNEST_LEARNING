package com.kodnest.practice.palindromeChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		PalindromeChecker palindrome=new PalindromeChecker();
		boolean p1=palindrome.checkPalindrome(n);
		if(p1==true)
		{
			System.out.println("this is a palindrome");
		}
		else
		{
			System.out.println("this is not a palindrome");
		}
	}

}
