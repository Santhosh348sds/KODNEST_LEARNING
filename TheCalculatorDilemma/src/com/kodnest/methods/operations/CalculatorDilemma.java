package com.kodnest.methods.operations;

import java.util.Scanner;

public class CalculatorDilemma {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two values to perform an arithmetic operations");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Enter any one of these operator(+,-,*,/,%)");
	char operator=scan.next().charAt(0);
	scan.close();
	arithmeticOperations(a,b,operator);
	
}
public static void arithmeticOperations(int a,int b,char operator)
{
switch(operator)
{
case '+':
	System.out.println("Addition of two numbers is: "+(a+b));
	break;
case '-':
	System.out.println("Subraction of two numbers is: "+(a-b));
	break;
case '*':
	System.out.println("Multiplication of two numbers is: "+(a*b));
	break;
case '/':
	System.out.println("Division of two numbers is: "+(a/b));
	break;
case '%':
	System.out.println("Remainder of division for two numbers is: "+(a%b));
	break;
default:
	System.out.println("Oops! operator is incorrect, Enter only arithmetic operators.");
}
}}