package Codes_DMS;

import java.util.Scanner;

public class IsGivenNumberDivisibleByThreeAndSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number here : ");
		int a = sc.nextInt();
		if (a < 3) {
			System.out.println("Print the nummber atleast which should be more than 3");
		}

		if (a % 3 == 0 && a % 7 == 0) {
			System.out.println("The given number is divisible by 3 and 7.");
		} else {
			System.out.println("The given number is not divisible by 3 and 7");
		}

	}

}
