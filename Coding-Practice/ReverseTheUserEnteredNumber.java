package Java_Codes;

import java.util.Scanner;

public class ReverseTheUserEnteredNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number here : ");
		int a = sc.nextInt();// 123,12, 1
		int b = 0;
		while (a > 0) {
			int c = a % 10;// 3,2, 1
			b = b * 10 + c;// 3,32,321
			a = a / 10;//
		}
		System.out.println(" " + b);

	}

}
