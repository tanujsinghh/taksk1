package program;

import java.util.Scanner;

public class p6 {
		//to check if the number is palindrome or not
	public static void main(String[] args) {
		System.out.println("enter a no: ");
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		System.out.println(isPalindromeShortHand(x+""));
		
	}
	


public static boolean isPalindromeShortHand(String s) {
		
		return new StringBuilder(s).reverse().toString().equals(s);

	}

}
