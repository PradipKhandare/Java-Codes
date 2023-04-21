package Codes_Conditional_Operator;

import java.util.Scanner;

public class FindMaxNumberOutOfFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		System.out.println("Enter the fourth number");
		int d = sc.nextInt();

		String res = ((a > b && a > c && a > d) ? "greatet number is : " + a
				: (b > c && b > d && b > a) ? "greatet number is : " + b
						: (c > d && c > a && c > b) ? "greatet number is : " + c : "greatet number is : " + d);

		System.out.println(res);
	}

}
