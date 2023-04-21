package Codes_Conditional_Operator;

import java.util.Scanner;

public class FindMinOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		System.out.println("Enter third number : ");
		int c = sc.nextInt();

		String res = ((a < b && a < c) ? "lowest number is : " + a
				: (b < c) ? "lowest number is : " + b : "Lowest number is : " + c);

		System.out.println(res);

	}

}
