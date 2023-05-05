import java.util.*;

public class duplicatNumsQFor{
    public static int lastFind(int arr[], int low, int high,int tar){
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == tar){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > tar){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int firstFind(int arr[], int low, int high,int tar){
        int anss = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == tar){
                anss = mid;
                high = mid - 1;
            }
            else if(arr[mid] > tar){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return anss;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array : ");

        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Element : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Value :- ");
        int target = sc.nextInt();

        int first = firstFind(arr,0,n-1,target);
        int last = lastFind(arr,0,n-1,target);
        if(first == last && first == -1){
            System.out.print("Target is not match in array: - ");
        }else{
            System.out.print("the Target Value is Match in Array :- "+ (last - first + 1) + " Times");
        }
    }

}