package com.kodnest.LabeledLoop.do_while;

public class Labeled_dowhile {
	public static void main(String[] args) {
		int j=1;
		label1: do
		{
		int i=1;
		label2: do
		{
			System.out.println("* ");
			i++;
			break label1;
		} while(i<=5);
		
		}while(j<=5);
		j++;
		System.out.println();
	}


}
