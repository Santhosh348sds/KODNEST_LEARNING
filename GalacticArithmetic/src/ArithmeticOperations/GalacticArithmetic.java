package ArithmeticOperations;

import java.util.Scanner;


public class GalacticArithmetic {

		public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers for addition");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println(addingNumbers(num1,num2));
	System.out.println("Enter two numbers for subraction");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println(subractNumbers(num1,num2));
	System.out.println("Enter two numbers for multiplication");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println(multiplyNumbers(num1,num2));
	System.out.println("Enter two numbers for divition");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println(divideNumbers(num1,num2));
	System.out.println("Enter two numbers to find a remainder");
	num1=scan.nextInt();
	num2=scan.nextInt();
	scan.close();
	System.out.println(findremaider(num1,num2));
		}
    public static int addingNumbers(int num1,int num2) {
    	return num1+num2;
    }

	public static int subractNumbers(int num2,int num1)
	{
		return num2-num1;

	}
	public static int multiplyNumbers(int num1,int num2)
	{
		return num2*num1;

	}
	public static int divideNumbers(int num1,int num2)
	{
		return num1/num2;

	}
	public static int findremaider(int num1,int num2)
	{
		return num1%num2;

	}

	}