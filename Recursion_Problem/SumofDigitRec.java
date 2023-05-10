import java.util.*;
public class SumofDigitRec {
    public static int dig(int n){
        // int n=arr[];
        if(n==0){
            return 0;
        }
        return((n%10)+dig(n/10));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int arr=sc.nextInt();
        // int arr[] =new int[n];
        // System.out.print("Enter Array Element: ");
        // for(int i=0; i<n; i++){
        //     // System.out.println("Value is: "+ i);
        //     arr[i] = sc.nextInt();
            
        // }
        // int arr =12345;
        int res = dig(arr);
        System.out.print("The Sum of Digits for given Number: "+res);
    }
}
