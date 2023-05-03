// Q1. Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.Arrays;

public class BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    // Swaping Now
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        bubbleSort(arr);
        System.out.print(" Array Sort Descending Order : ");
        System.out.println(Arrays.toString(arr));
    }
}