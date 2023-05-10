import java.util.*;

public class BinaryRecursive {
    public static int binarySearchRecur(int arr[],int l, int h, int tar){
        // int low=0, high = arr.length;
        int result = -1;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(arr[mid] ==  tar){
                return mid;
            }
            if(arr[mid] < tar){
                return binarySearchRecur(arr, mid+1, h,tar);
            }
            else{
                return binarySearchRecur(arr, l, mid-1,tar);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Array Size Element: ");
    int n=sc.nextInt();
    System.out.println("Enter Array Number: ");
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter What Target Number: ");
    int Target = sc.nextInt();
    int result = binarySearchRecur(arr,0,arr.length-1,Target);
    if( result == -1){
        System.out.println("Target Value is Not Found this Array: "+result);
    }else{
        System.out.println("This Element is Match this Array "+result);
    }
    
    }
}
