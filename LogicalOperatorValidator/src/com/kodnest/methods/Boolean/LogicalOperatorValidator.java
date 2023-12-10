package com.kodnest.methods.Boolean;

import java.util.Scanner;

public class LogicalOperatorValidator {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Is input valid(true/false)");
	boolean isValid=scan.nextBoolean();
	System.out.println("Does input meet a certain condition (true/false)");
	boolean meetsCertainCondition = scan.nextBoolean();
	boolean res=isValidInput(isValid,meetsCertainCondition);
	if(res==true)
	{
	System.out.println("Input is valid");
	}
	else
	{
		System.out.println("Input is not valid");
	}
}
public static boolean isValidInput(boolean isValid,boolean meetsCertainCondition) {
	return isValid && meetsCertainCondition;
}
}
