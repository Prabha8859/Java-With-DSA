import java.util.Scanner;

public class CountingQfor {
    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Integer: ");
        int num=sc.nextInt();

        int result = countSetBits(num);
        System.out.print("The number of set bits in the given numbers are :"+result);
    }
}
