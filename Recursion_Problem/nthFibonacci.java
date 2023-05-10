import java.util.Scanner;

public class nthFibonacci{
    public static int findNthNumber(int n){
        int res=0;
        if(n<=1){
            return n;
        }
        else{
            res = findNthNumber(n-1)+findNthNumber(n-2);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int nums = sc.nextInt();
        int result = findNthNumber(nums);
        System.out.print("Fint THe Fibonacci number Given : "+result);
    }
}