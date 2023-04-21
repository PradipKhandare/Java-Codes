package Java_Codes;

import java.util.Scanner;

public class FindPerfectNumberFromOneToUserEnterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number here! : ");
		int a = sc.nextInt();
		int b = 1;
		for (int i = 1; i < a; i++) {
			perfect(i);
		}

	}

	public static void perfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println("The given " + sum + " is perfect Number");
		}
	}

}
