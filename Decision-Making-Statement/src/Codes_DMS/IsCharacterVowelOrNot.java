package Codes_DMS;

import java.util.Scanner;

public class IsCharacterVowelOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char a = sc.next().charAt(0);

		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("the given character is vowel");
		} else {
			System.out.println("The given character is not vowel");
		}

	}

}
