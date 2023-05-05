// Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
// number of times except one which appears an odd number of times. Find that odd appearing
// element in linear time and without using any extra memory.
// For example,
// Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
// Output : The odd occurring element is 4.
import java.util.*;
import java.util.Scanner;

public class QFive{
    public static int findOddOccuring(int ar[]){
        int xor = 0;
        for(int i : ar){
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int n=sc.nextInt();
        int arr [] = new int [10];
        System.out.println("Enter Element of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Odd Occurring Element is :" +  findOddOccuring(arr));
    }
}