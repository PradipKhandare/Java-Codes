
//Write a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width : ");
		double w = sc.nextDouble();
		System.out.print("Enter the height : ");
		double h = sc.nextDouble();
		double p = 2 * (w + h);
		System.out.println("The perimeter of a rectangle is : " + p);

	}

}
