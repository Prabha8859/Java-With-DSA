// import java.util.*;
// public class Lastnumber{
   
//     public static int findlowerBound(int arr[], int tar){
//         int low=0,high=arr.length-1;
//         int result = -1;
//         while(low <= high){
//             int mid = low + (high - low )/2;
//             if(arr[mid] == tar){ 
//                 result =  mid;
//                 high = mid -1;
//             }else if(arr[mid] > tar){
//                 high = mid -1;
//             }else{
//                 low  = mid+1;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
       
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number for choose Array Element : ");
//         int n=sc.nextInt();
//         System.out.println("Enter Array Element:- ");
//         int arr [] = new int [n];

//         for(int i=0; i<n;i++){
//             arr[i]= sc.nextInt();
//         }
//         System.out.println("Enter Target Value For Search Lower Bound: -");
//         int x= sc.nextInt();
//        int result =  findlowerBound(arr, x);
//         if(result == -1){
//             System.out.println("This ELement is not Found");
//         }else{
//             System.out.println( "Target ELement is Loaction : "+result);
//         }
//     }

// }
