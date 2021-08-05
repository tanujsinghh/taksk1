package program;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		//to check prime or not
		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		
		if (isPrime(a))
            System.out.println("true");
 
        else
            System.out.println("false");
		
	}

	
	static boolean isPrime(int n)
    {
 
        if (n <= 1)
            return false;
 
       
        else if (n == 2)
            return true;
 
      
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;

	}

}
