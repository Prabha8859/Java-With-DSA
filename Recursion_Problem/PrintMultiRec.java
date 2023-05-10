import java.util.*;
public class PrintMultiRec {
    public static void printMulti(int a, int b){
        int find =0;
        if(b == 1){
            System.out.println("Multiply A And B: "+a+" * "+b+" = "+a);
            return ;
        }
        printMulti(a,b-1);
        System.out.println("Multiply A And B: "+a+" * "+b+" = "+a*b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int a=sc.nextInt();
        System.out.print("Enter b Value: ");
        int b=sc.nextInt();
         printMulti(a,b);
         System.out.println();
    }
}
