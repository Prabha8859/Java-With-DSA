// Q1 : Given an integer, find out the sum of its digits using recursion.
// Input: n= 1234
// Output: 10
// Explanation: 1+2+3+4=10

// import java.lang.invoke.CallSite;
// import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class SumofDigits{
    public static int callsum(int x){
        // Base Case Condition
        if(x==0){
            return 0;
        }
        // Recursively call
         
        return ((x%10)+callsum(x/10));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int res = callsum(n);
        System.out.println("Sum of Digits for given numbers: "+ res);
    }
}