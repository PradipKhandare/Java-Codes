
//Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double r = sc.nextDouble();
		double pi = 3.14;
		System.out.println("The perimeter of the circle is : " + 2 * pi * r * r);
		System.out.println("The area of the circle is : " + pi * r * r);

	}

}
