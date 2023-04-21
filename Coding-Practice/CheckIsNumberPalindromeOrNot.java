package Java_Codes;

import java.util.Scanner;

public class CheckIsNumberPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number here bro : ");
		int n = sc.nextInt();
		int m = n;
		int b = 0;
		while (n > 0) {
			int a = n % 10;
			b = b * 10 + a;
			n = n / 10;
		}
//		System.out.println(b);
		if (b == m) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("Please enter again number is not palindrome");
		}
	}

}
