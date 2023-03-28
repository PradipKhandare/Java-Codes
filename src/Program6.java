
//Write a Java program that takes a number as input and prints its multiplication table upto 10
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int m = n;
		for (int i = 1; i <= 10; i++) {
			m = n * i;
			System.out.println(m + "*" + i + "=" + m);
		}

	}

}
