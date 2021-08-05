package program;

import java.util.Scanner;

public class p1 {
		//first non- repeated character in a string 
	public static void main(String[] args) {
		Scanner sr= new Scanner(System.in);
		sr.close();
		System.out.println("enter value for n: ");      //entering the array size
        int n = sr.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");        //feeding the input
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int temp=0;									//a check or a flag 
        
        for(int i=0;i<n;i++)       //checking for the duplicate
           {for(int j=i+1;j<n;j++)  //and comparing it with the first element
            if(arr[i]==arr[j])
              {
                System.out.println(arr[i]);
                temp=1;
                i=n;j=n;
              }
        }
        if(temp==0)
        System.out.println("No repeating integer found");

	}

}
