package Java_Codes;

import java.util.Scanner;

public class IsNumberPerfectOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number  :   ");
		int a = sc.nextInt();
		int b = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				b = b + i;
			}
		}
		if (b == a) {
			System.out.println("The given number is perfect number.");
		} else {
			System.out.println("The given number is not perfect number.");
		}

	}

}
