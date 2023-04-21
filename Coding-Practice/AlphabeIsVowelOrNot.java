package Java_Codes;

import java.util.Scanner;

public class AlphabeIsVowelOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the character here : ");
		char a = sc.next().charAt(0);
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("The given character is vowel.");
		} else {
			System.out.println("The given character is consonent");
		}

	}

}
