// Q2. WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int selct = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] > arr[selct]){
                    selct = j;
                }
            }
            int temp = arr[selct];
            arr[selct] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {3,5,1,6,0};
        selectionSort(arr);
        System.out.print("This Array is Descending Order: ");
        System.out.println(Arrays.toString(arr));
    }
}
