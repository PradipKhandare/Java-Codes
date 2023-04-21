package Codes_DMS;

import java.util.Scanner;

public class GivenNumberIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number here : ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("the given number is even");
		} else {
			System.out.println("The given number is odd");
		}

	}

}
