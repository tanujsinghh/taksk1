package program;

public class p4 {

	public static void main(String[] args) {
			//finding the duplicates and removing them
		   //and printing the omitted array and the maximum 
		int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        int max = arr[0];
        length = removeDuplicateElements(arr, length);  
         
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");
        System.out.println("\nmax element: " );
        for (int i=0; i<length; i++)  
        {
        	if (arr[i]>max)
        		 max = arr[i];
        }
        	System.out.println(max);
        
        

	}
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
       
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  

	}

}
