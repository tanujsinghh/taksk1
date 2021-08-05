package program;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// to find hypotenuse of a triangle
		System.out.println("Enter value for sides other than hypotenuse: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("The hypotenuse of the traingle with the given sides are: " + Math.sqrt(((a*a)+(b*b))));

	}

}
