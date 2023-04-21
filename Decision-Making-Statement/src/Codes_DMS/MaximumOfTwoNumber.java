package Codes_DMS;

import java.util.Scanner;

public class MaximumOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first Number");
		int a = sc.nextInt();
		System.out.println("Please enter the second number");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("the maximum number is : " + a);
		} else {
			System.out.println("The maximum number is : " + b);
		}

	}

}
