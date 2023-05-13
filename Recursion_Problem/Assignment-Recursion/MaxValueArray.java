// Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

import java.util.Scanner;

public class MaxValueArray {
    public static int findMinRec(int A[], int n)
    {
      // if size = 0 means whole array
      // has been traversed
      if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], findMinRec(A, n-1));
    }
     
    // Driver code
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter Array number: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // int A[] = {13, 1, -3, 22, 5};
        int x = arr.length;
         
        // Function calling
        System.out.println("This Value is "+findMinRec(arr, x)+" Maxmum");
    }
}
