//Write a Java program to convert a decimal number to hexadecimal number

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal value : ");
		int num = sc.nextInt();
		String hex_dec = " ";
		int rem;
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (num > 0) {
			rem = num % 16;
			hex_dec = hex[rem] + hex_dec;
			num = num / 16;
		}
		System.out.println("Hexadecimal number is : " + hex_dec);
	}
}
