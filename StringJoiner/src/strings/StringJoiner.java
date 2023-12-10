package strings;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String str1=scan.next();
		System.out.println("Enter the Last Name");
		String str2=scan.next();
		scan.close();
		System.out.println(joinStrings(str1,str2));
	}
	public static String joinStrings(String str1,String str2) {
	return str1+" "+str2;
	}
}
