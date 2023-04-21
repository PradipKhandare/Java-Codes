package Java_Codes;

import java.util.Scanner;

public class CheckTheGivenNumberIsStrongOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		while (n > 0) {
			int a = n % 10;
			sum = sum + fact(a);
			n = n / 10;
		}
		if (sum == m) {
			System.out.println("Given number is strong number");
		} else {
			System.out.println("Given number is not strong number");
		}

	}

	public static int fact(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

}
