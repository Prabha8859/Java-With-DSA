import java.util.Scanner;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number of Element you Want to odd : ");
       int n = sc.nextInt();
       System.out.println("Enter Array Element: ");
       int arr [] = new int[n] ;
       for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
       }
       System.out.print("Enter Target Value: ");
       int x= sc.nextInt();             

       int index = -1;
       for(int i=0; i<n; i++){
        if(arr[i] == x){
            index = i;
            break;
        }
       }
       if(index == -1){
        System.out.println("Element is Not Foound: "+x);
       }else{
        System.out.println("Enter the element of searched in array: "+ index);
       }
    }
}
