package com.kodnest.practice.palindromeChecker;

public class PalindromeChecker {
	public boolean checkPalindrome(int n)
	{
		int original=n;
		int rev=0;
		while(n>0)
		{
			int rem = n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.print(rev+" ");
		return original==rev;
	
	}

}
