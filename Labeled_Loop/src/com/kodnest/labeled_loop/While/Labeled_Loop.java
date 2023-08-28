package com.kodnest.labeled_loop.While;

public class Labeled_Loop {
	public static void main(String[] args) {
		int j=1;
		// label is   
		label1: while(j<=5)
		{
		int i=1;
		label2: while(i<=5)
		{
			System.out.println("* ");
			i++;
			break label1;
		}
		j++;
		System.out.println();
		}
	}

}
