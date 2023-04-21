package Codes_DMS;

import java.util.Scanner;

public class IsGivenNumberPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println(a + " is positive");
		} else {
			System.out.println(a + " is negative.");
		}

	}

}
