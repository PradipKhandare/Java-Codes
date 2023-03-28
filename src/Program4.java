
/* Write a Java program that takes two numbers as input and display the product of two numbers.*/
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.print("enter first number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("enter second number : ");
		int m = sc.nextInt();
		System.out.println("the product of two number is : " + n * m);

	}

}
