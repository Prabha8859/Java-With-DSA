import java.util.*;
public class SortingFiveQ {
    public static void insertionSort(int arr[]){
        int count = 0;

        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j] > arr[j-1]){
                count++;
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("This Counting : "+ count);
    }
    public static void main(String[] args) {
        int arr [] = {3,5,1,6,0};
        insertionSort(arr);
        System.out.print("This Array is Descending Order: ");
        System.out.println(Arrays.toString(arr));
    }
}
