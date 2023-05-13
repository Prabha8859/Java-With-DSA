// Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].

import java.util.Scanner;

public class SumofArray {
    public static int sumArr(int arr[],int y){
        if(y <= 0){
            return 0;
        }
        return (sumArr(arr, y-1) + arr[y-1]);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Value of Array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = arr.length;
        System.out.println("Sum of Array: "+sumArr(arr,x));
    }
}
